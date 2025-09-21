package dev.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.FoodKitchenGroup

val FoodKitchenGroup.ChefHatMinimalistic: ImageVector
    get() {
        if (_chefHatMinimalistic != null) {
            return _chefHatMinimalistic!!
        }
        _chefHatMinimalistic = Builder(
            name = "ChefHatMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 7.2386f, 4.2386f, 5.0f, 7.0f, 5.0f)
                curveTo(7.2505f, 5.0f, 7.4967f, 5.0184f, 7.7374f, 5.054f)
                curveTo(8.3396f, 3.2781f, 10.0206f, 2.0f, 12.0f, 2.0f)
                curveTo(13.9794f, 2.0f, 15.6604f, 3.2781f, 16.2626f, 5.054f)
                curveTo(16.5033f, 5.0184f, 16.7495f, 5.0f, 17.0f, 5.0f)
                curveTo(19.7614f, 5.0f, 22.0f, 7.2386f, 22.0f, 10.0f)
                curveTo(22.0f, 12.0503f, 20.7659f, 13.8124f, 19.0f, 14.584f)
                lineTo(19.0f, 18.0f)
                curveTo(19.0f, 19.8856f, 19.0f, 20.8284f, 18.4142f, 21.4142f)
                curveTo(17.8284f, 22.0f, 16.8856f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 22.0f, 6.1716f, 22.0f, 5.5858f, 21.4142f)
                curveTo(5.0f, 20.8284f, 5.0f, 19.8856f, 5.0f, 18.0f)
                verticalLineTo(14.584f)
                curveTo(3.2341f, 13.8124f, 2.0f, 12.0503f, 2.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.25f)
                curveTo(8.5858f, 17.25f, 8.25f, 17.5858f, 8.25f, 18.0f)
                curveTo(8.25f, 18.4142f, 8.5858f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 18.75f, 15.75f, 18.4142f, 15.75f, 18.0f)
                curveTo(15.75f, 17.5858f, 15.4142f, 17.25f, 15.0f, 17.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _chefHatMinimalistic!!
    }

private var _chefHatMinimalistic: ImageVector? = null
