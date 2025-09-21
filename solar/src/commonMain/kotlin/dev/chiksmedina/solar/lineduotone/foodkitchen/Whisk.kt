package dev.chiksmedina.solar.lineduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.FoodKitchenGroup

val FoodKitchenGroup.Whisk: ImageVector
    get() {
        if (_whisk != null) {
            return _whisk!!
        }
        _whisk = Builder(
            name = "Whisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.816f, 12.236f)
                curveTo(22.3734f, 9.6787f, 22.7721f, 5.675f, 20.5486f, 3.4515f)
                curveTo(18.325f, 1.2281f, 14.3212f, 1.6267f, 11.7638f, 4.1841f)
                curveTo(9.2063f, 6.7414f, 7.8571f, 11.6956f, 10.0807f, 13.9191f)
                curveTo(12.3042f, 16.1425f, 17.2585f, 14.7934f, 19.816f, 12.236f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.8991f, 15.127f)
                lineTo(6.8599f, 21.166f)
                curveTo(5.7482f, 22.2777f, 3.9456f, 22.2777f, 2.8338f, 21.166f)
                curveTo(1.7221f, 20.0543f, 1.7221f, 18.2518f, 2.8338f, 17.14f)
                lineTo(8.873f, 11.1011f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5486f, 3.4514f)
                curveTo(21.7567f, 4.6595f, 19.0985f, 8.1228f, 17.328f, 9.8933f)
                curveTo(15.5575f, 11.6637f, 11.2888f, 15.127f, 10.0807f, 13.919f)
                curveTo(8.8726f, 12.7109f, 12.3366f, 8.443f, 14.1071f, 6.6725f)
                curveTo(15.8776f, 4.902f, 19.3405f, 2.2434f, 20.5486f, 3.4514f)
                close()
            }
        }
            .build()
        return _whisk!!
    }

private var _whisk: ImageVector? = null
