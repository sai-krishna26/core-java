class ComplexRunner
{
	public static void main(String[] values)
	{
		//Complex complex=new Complex();
		//Complex.Bun bun=Complex.new Bun();
		
		Complex complex = new Complex();
        Complex.Bun bun = complex.new Bun();
		Complex.PenDrive penDrive =complex.new PenDrive();
		Complex.HappyDent happyDent=complex.new HappyDent();
		
		System.out.println("default shape: " + bun.shape);
		System.out.println("default cost: " + bun.cost);
		System.out.println("default manufacturedDay: " + bun.manufacturedDay);
		System.out.println("default manufacturedDayName: " + bun.manufacturedDayName);
		System.out.println("default manufacturedMonth: " + bun.manufacturedMonth);
		System.out.println("default manufacturedMonthName: " + bun.manufacturedMonthName);
		System.out.println("default manufacturedYear: " + bun.manufacturedYear);
		System.out.println("default countPerPack: " + bun.countPerPack);
		System.out.println("default companies: " + bun.companies);
		System.out.println("default ingredients: " + bun.ingredients);
		
		bun.shape="square";
		bun.cost = 25.5f;
		bun.manufacturedDay = 12;
		bun.manufacturedDayName = "Monday";
		bun.manufacturedMonth = 2;
		bun.manufacturedMonthName = "February";
		bun.manufacturedYear = 2026;
		bun.countPerPack = 6;
		bun.companies = new String[]{"Britannia", "Modern", "Harvest Gold"};
		bun.ingredients = new String[]{"Flour", "Sugar", "Yeast", "Salt"};
		
		System.out.println("\ninitialized shape: " + bun.shape);
		System.out.println("initialized cost: " + bun.cost);
		System.out.println("initialized manufacturedDay: " + bun.manufacturedDay);
		System.out.println("initialized manufacturedDayName: " + bun.manufacturedDayName);
		System.out.println("initialized manufacturedMonth: " + bun.manufacturedMonth);
		System.out.println("initialized manufacturedMonthName: " + bun.manufacturedMonthName);
		System.out.println("initialized manufacturedYear: " + bun.manufacturedYear);
		System.out.println("initialized countPerPack: " + bun.countPerPack);
		System.out.println("initialized companies: ");
		for(int i=0;i<bun.companies.length;i++)
		{
			System.out.print(bun.companies[i]+", ");
		}
		System.out.println("\ninitialized ingredients: ");
		for(int j=0;j<bun.ingredients.length;j++)
		{
			System.out.print(bun.ingredients[j]+", ");
		}
		
		
		
		System.out.println("\n\nDefault PenDrive values:");
		System.out.println("default size : " + penDrive.size);
		System.out.println("default brand : " + penDrive.brand);
		System.out.println("default price : " + penDrive.price);
		System.out.println("default color : " + penDrive.color);
		System.out.println("default weight : " + penDrive.weight);
		System.out.println("default type : " + penDrive.type);
		System.out.println("default isWorking : " + penDrive.isWorking);
		System.out.println("default warrantyYears : " + penDrive.warrantyYears);
		System.out.println("default material : " + penDrive.material);
		System.out.println("default transferSpeed : " + penDrive.transferSpeed);
		System.out.println("default connectorType : " + penDrive.connectorType);
		System.out.println("default manufacturingYear : " + penDrive.manufacturingYear);
		System.out.println("default isWaterProof : " + penDrive.isWaterProof);
		System.out.println("default isShockProof : " + penDrive.isShockProof);
		System.out.println("default countryOfOrigin : " + penDrive.countryOfOrigin);
		System.out.println("default serialNumber : " + penDrive.serialNumber);
		System.out.println("default compatibleDevices : " + penDrive.compatibleDevices);
		System.out.println("default availableColors : " + penDrive.availableColors);
		System.out.println("default features : " + penDrive.features);
		

        penDrive.size = 64;
        penDrive.brand = "SanDisk";
        penDrive.price = 599.99;
        penDrive.color = "Black";
        penDrive.weight = 15.5;
        penDrive.type = "USB 3.0";
        penDrive.isWorking = true;
        penDrive.warrantyYears = 5;
        penDrive.material = "Plastic";
        penDrive.transferSpeed = 150.5;
        penDrive.connectorType = "Type-A";
        penDrive.manufacturingYear = 2025;
        penDrive.isWaterProof = true;
        penDrive.isShockProof = true;
        penDrive.countryOfOrigin = "India";
        penDrive.serialNumber = 123456789L;
        penDrive.compatibleDevices = new String[]{"Laptop", "Desktop", "TV"};
        penDrive.availableColors = new String[]{"Black", "Red"};
        penDrive.features = new String[]{"High Speed", "Compact", "Durable"};

		System.out.println("\nInitialized PenDrive values:");
		System.out.println("size : " + penDrive.size);
		System.out.println("brand : " + penDrive.brand);
		System.out.println("price : " + penDrive.price);
		System.out.println("color : " + penDrive.color);
		System.out.println("weight : " + penDrive.weight);
		System.out.println("type : " + penDrive.type);
		System.out.println("isWorking : " + penDrive.isWorking);
		System.out.println("warrantyYears : " + penDrive.warrantyYears);
		System.out.println("material : " + penDrive.material);
		System.out.println("transferSpeed : " + penDrive.transferSpeed);
		System.out.println("connectorType : " + penDrive.connectorType);
		System.out.println("manufacturingYear : " + penDrive.manufacturingYear);
		System.out.println("isWaterProof : " + penDrive.isWaterProof);
		System.out.println("isShockProof : " + penDrive.isShockProof);
		System.out.println("countryOfOrigin : " + penDrive.countryOfOrigin);
		System.out.println("serialNumber : " + penDrive.serialNumber);

		System.out.println("compatibleDevices :");
		for(String device : penDrive.compatibleDevices)
		{
			System.out.print(device + ", ");
		}

		System.out.println("\navailableColors :");
		for(String color : penDrive.availableColors)
		{
			System.out.print(color + ", ");
		}

		System.out.println("\nfeatures :");
		for(String feature : penDrive.features)
		{
			System.out.print(feature + ", ");
		}

        
		
		
		System.out.println("\n\nDefault HappyDent values:");
		System.out.println("default brand : " + happyDent.brand);
		System.out.println("default flavor : " + happyDent.flavor);
		System.out.println("default price : " + happyDent.price);
		System.out.println("default quantity : " + happyDent.quantity);
		System.out.println("default weight : " + happyDent.weight);
		System.out.println("default isSugarFree : " + happyDent.isSugarFree);
		System.out.println("default isAvailable : " + happyDent.isAvailable);
		System.out.println("default manufacturer : " + happyDent.manufacturer);
		System.out.println("default manufacturingYear : " + happyDent.manufacturingYear);
		System.out.println("default expiryYear : " + happyDent.expiryYear);
		System.out.println("default color : " + happyDent.color);
		System.out.println("default shape : " + happyDent.shape);
		System.out.println("default packagingType : " + happyDent.packagingType);
		System.out.println("default sizeCategory : " + happyDent.sizeCategory);
		System.out.println("default length : " + happyDent.length);
		System.out.println("default width : " + happyDent.width);
		System.out.println("default thickness : " + happyDent.thickness);
		System.out.println("default rating : " + happyDent.rating);
		System.out.println("default numberOfPieces : " + happyDent.numberOfPieces);
		System.out.println("default barcode : " + happyDent.barcode);
		System.out.println("default tagline : " + happyDent.tagline);
		System.out.println("default countryOfOrigin : " + happyDent.countryOfOrigin);
		System.out.println("default isExported : " + happyDent.isExported);
		System.out.println("default discountPercentage : " + happyDent.discountPercentage);
		System.out.println("default stockAvailable : " + happyDent.stockAvailable);
		System.out.println("default targetAudience : " + happyDent.targetAudience);
		System.out.println("default ingredientsInfo : " + happyDent.ingredientsInfo);
		System.out.println("default isVegetarian : " + happyDent.isVegetarian);
		System.out.println("default ingredients : " + happyDent.ingredients);
		System.out.println("default availableFlavors : " + happyDent.availableFlavors);

        happyDent.brand = "HappyDent";
        happyDent.flavor = "Mint";
        happyDent.price = 10.0;
        happyDent.quantity = 20;
        happyDent.weight = 50.5;
        happyDent.isSugarFree = true;
        happyDent.isAvailable = true;
        happyDent.manufacturer = "Perfetti";
        happyDent.manufacturingYear = 2026;
        happyDent.expiryYear = 2027;
        happyDent.color = "White";
        happyDent.shape = "Oval";
        happyDent.packagingType = "Plastic Pack";
        happyDent.sizeCategory = "Small";
        happyDent.length = 2.5;
        happyDent.width = 1.0;
        happyDent.thickness = 0.5;
        happyDent.rating = 4.5;
        happyDent.numberOfPieces = 10;
        happyDent.barcode = 987654321L;
        happyDent.tagline = "Bright Smile";
        happyDent.countryOfOrigin = "India";
        happyDent.isExported = false;
        happyDent.discountPercentage = 5.0;
        happyDent.stockAvailable = 100;
        happyDent.targetAudience = "Kids";
        happyDent.ingredientsInfo = "Sugar, Flavor";
        happyDent.isVegetarian = true;
        happyDent.ingredients = new String[]{"Sugar", "Mint", "Glucose"};
        happyDent.availableFlavors = new String[]{"Mint", "Strawberry"};

		System.out.println("\nInitialized HappyDent values:");
		System.out.println("brand : " + happyDent.brand);
		System.out.println("flavor : " + happyDent.flavor);
		System.out.println("price : " + happyDent.price);
		System.out.println("quantity : " + happyDent.quantity);
		System.out.println("weight : " + happyDent.weight);
		System.out.println("isSugarFree : " + happyDent.isSugarFree);
		System.out.println("isAvailable : " + happyDent.isAvailable);
		System.out.println("manufacturer : " + happyDent.manufacturer);
		System.out.println("manufacturingYear : " + happyDent.manufacturingYear);
		System.out.println("expiryYear : " + happyDent.expiryYear);
		System.out.println("color : " + happyDent.color);
		System.out.println("shape : " + happyDent.shape);
		System.out.println("packagingType : " + happyDent.packagingType);
		System.out.println("sizeCategory : " + happyDent.sizeCategory);
		System.out.println("length : " + happyDent.length);
		System.out.println("width : " + happyDent.width);
		System.out.println("thickness : " + happyDent.thickness);
		System.out.println("rating : " + happyDent.rating);
		System.out.println("numberOfPieces : " + happyDent.numberOfPieces);
		System.out.println("barcode : " + happyDent.barcode);
		System.out.println("tagline : " + happyDent.tagline);
		System.out.println("countryOfOrigin : " + happyDent.countryOfOrigin);
		System.out.println("isExported : " + happyDent.isExported);
		System.out.println("discountPercentage : " + happyDent.discountPercentage);
		System.out.println("stockAvailable : " + happyDent.stockAvailable);
		System.out.println("targetAudience : " + happyDent.targetAudience);
		System.out.println("ingredientsInfo : " + happyDent.ingredientsInfo);
		System.out.println("isVegetarian : " + happyDent.isVegetarian);

		System.out.println("ingredients :");
		for(String ing : happyDent.ingredients)
		{
			System.out.print(ing + ", ");
		}

		System.out.println("\navailableFlavors :");
		for(String flavor : happyDent.availableFlavors)
		{
			System.out.print(flavor + ", ");
		}
	}
}