package com.gildedrose;

class GildedRose {
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String CONJURED = "Conjured";

    static Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public static void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            decrementQuality(items[i]);
            
            incrementQuality(items[i]);

            updateSellIn(items[i]);
            
            if (items[i].sellIn < 0) {
                if (items[i].quality < 50 && items[i].name.equals(AGED_BRIE) ) {
                    incrementQuality(items[i]);
                }

                if (items[i].name.equals(BACKSTAGE_PASSES)) {
                    items[i].quality = 0;
                }
            }
                
            
        }
    }

    private static void updateSellIn(Item item) {
        if (!item.name.equals(SULFURAS)) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private static void incrementQuality(Item item) {
        if (!item.name.equals(AGED_BRIE) && !item.name.equals(BACKSTAGE_PASSES)) {
            return;
        }
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.name.equals(BACKSTAGE_PASSES)) {
                if (item.sellIn < 11) {
                    item.quality = item.quality + 1;
                    
                }

                if (item.sellIn < 6) {
                    item.quality = item.quality + 1;
                    
                }
            }
        }
    }

    public static void decrementQuality(Item item) {

        int sellIn = item.sellIn;
        int quality = item.quality;

        int decrementBy = 1;

        //never decrement the holy aged brie and sulfuras. oh and backstage passes
        if (item.name.equals(AGED_BRIE) || item.name.equals(SULFURAS) || item.name.equals(BACKSTAGE_PASSES)) {
            return;
        }

        // if sell-in is <= 0, quality decreases twice as fast
        if (sellIn <= 0 && quality > 0) {
            decrementBy *= 2;

            //backstage passes
            if (item.name.equals(BACKSTAGE_PASSES)) {
                item.quality = 0;
                return;
            }
        }

        if (item.name.equals(CONJURED)) {
            decrementBy *= 2;
        }
        
        //decrement quality unless it will go beyond 0, in which case => 0
        item.quality = Math.max(0, quality - decrementBy);
        
    }
}