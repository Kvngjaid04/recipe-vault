# RecipeVault Architecture

## Platform

Android First

Tech Stack:
- Kotlin
- Jetpack Compose
- Room Database
- Material 3
- OpenAI API
- Coil (images)
- Retrofit

## Core Modules

### Recipe Module

Stores:
- Title
- Ingredients
- Instructions
- Images
- Notes

### Scaling Engine

Handles:
- Serving adjustments
- Unit conversions
- Quantity recalculations

### Variations Engine

Stores:
- Original recipe
- AI generated versions
- User versions

### Import Engine

Sources:
- Shared URLs
- Browser share menu
- Text paste
- PDF import

### Search Engine

Search:
- Recipe title
- Ingredients
- Notes

### AI Assistant

Functions:
- Recipe modifications
- Ingredient substitutions
- Scaling advice
- Cooking questions

### Image Service

Stores:
- Recipe images
- Ingredient images