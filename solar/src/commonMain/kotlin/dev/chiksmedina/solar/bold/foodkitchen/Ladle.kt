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

val FoodKitchenGroup.Ladle: ImageVector
    get() {
        if (_ladle != null) {
            return _ladle!!
        }
        _ladle = Builder(
            name = "Ladle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.6842f, 2.75f)
                curveTo(4.0637f, 2.75f, 2.75f, 4.0637f, 2.75f, 5.6842f)
                curveTo(2.75f, 6.0984f, 2.4142f, 6.4342f, 2.0f, 6.4342f)
                curveTo(1.5858f, 6.4342f, 1.25f, 6.0984f, 1.25f, 5.6842f)
                curveTo(1.25f, 3.2353f, 3.2353f, 1.25f, 5.6842f, 1.25f)
                curveTo(8.1332f, 1.25f, 10.1184f, 3.2353f, 10.1184f, 5.6842f)
                verticalLineTo(11.741f)
                curveTo(9.766f, 11.9202f, 9.4346f, 12.1253f, 9.1444f, 12.3594f)
                curveTo(8.9714f, 12.4989f, 8.7873f, 12.6706f, 8.6184f, 12.8745f)
                verticalLineTo(5.6842f)
                curveTo(8.6184f, 4.0637f, 7.3047f, 2.75f, 5.6842f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.6331f, 16.143f)
                curveTo(8.8695f, 19.8315f, 11.936f, 22.75f, 15.6842f, 22.75f)
                curveTo(19.356f, 22.75f, 22.3736f, 19.9493f, 22.7174f, 16.3676f)
                curveTo(22.6491f, 16.4414f, 22.5794f, 16.5106f, 22.5096f, 16.5751f)
                curveTo(22.007f, 17.0392f, 21.3655f, 17.3922f, 20.7078f, 17.6583f)
                curveTo(19.3839f, 18.1939f, 17.6884f, 18.5f, 16.0f, 18.5f)
                curveTo(14.3146f, 18.5f, 12.5143f, 18.195f, 11.0918f, 17.6774f)
                curveTo(10.3865f, 17.4207f, 9.6921f, 17.0824f, 9.1444f, 16.6406f)
                curveTo(8.9764f, 16.5051f, 8.7979f, 16.3393f, 8.6331f, 16.143f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.5f)
                curveTo(22.0f, 15.8807f, 19.0539f, 17.0f, 16.0f, 17.0f)
                curveTo(12.9461f, 17.0f, 9.5f, 15.8807f, 9.5f, 14.5f)
                curveTo(9.5f, 13.1193f, 12.9461f, 12.0f, 16.0f, 12.0f)
                curveTo(19.0539f, 12.0f, 22.0f, 13.1193f, 22.0f, 14.5f)
                close()
            }
        }
            .build()
        return _ladle!!
    }

private var _ladle: ImageVector? = null
