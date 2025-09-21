package dev.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(
            name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 5.0f)
                curveTo(4.2386f, 5.0f, 2.0f, 7.2386f, 2.0f, 10.0f)
                curveTo(2.0f, 12.0503f, 3.2341f, 13.8124f, 5.0f, 14.584f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 14.584f)
                curveTo(20.7659f, 13.8124f, 22.0f, 12.0503f, 22.0f, 10.0f)
                curveTo(22.0f, 7.2386f, 19.7614f, 5.0f, 17.0f, 5.0f)
                curveTo(16.7495f, 5.0f, 16.5033f, 5.0184f, 16.2626f, 5.054f)
                curveTo(15.6604f, 3.2781f, 13.9794f, 2.0f, 12.0f, 2.0f)
                curveTo(10.0206f, 2.0f, 8.3396f, 3.2781f, 7.7374f, 5.054f)
                curveTo(7.4967f, 5.0184f, 7.2505f, 5.0f, 7.0f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.9983f, 18.75f)
                horizontalLineTo(5.0017f)
                curveTo(5.0119f, 20.1469f, 5.0834f, 20.9119f, 5.5858f, 21.4142f)
                curveTo(6.1716f, 22.0f, 7.1144f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(16.8856f, 22.0f, 17.8284f, 22.0f, 18.4142f, 21.4142f)
                curveTo(18.9166f, 20.9119f, 18.9881f, 20.1469f, 18.9983f, 18.75f)
                close()
            }
        }
            .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
