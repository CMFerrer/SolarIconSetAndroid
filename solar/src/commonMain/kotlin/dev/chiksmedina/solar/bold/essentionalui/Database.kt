package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(
            name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 18.0f)
                curveTo(20.0f, 20.2091f, 16.4183f, 22.0f, 12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 20.2091f, 4.0f, 18.0f)
                verticalLineTo(13.974f)
                curveTo(4.5022f, 14.5906f, 5.215f, 15.1029f, 6.0077f, 15.4992f)
                curveTo(7.58f, 16.2854f, 9.6997f, 16.75f, 12.0f, 16.75f)
                curveTo(14.3003f, 16.75f, 16.42f, 16.2854f, 17.9923f, 15.4992f)
                curveTo(18.7851f, 15.1029f, 19.4978f, 14.5906f, 20.0f, 13.974f)
                verticalLineTo(18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.75f)
                curveTo(14.3003f, 10.75f, 16.42f, 10.2854f, 17.9923f, 9.4993f)
                curveTo(18.7851f, 9.1028f, 19.4978f, 8.5906f, 20.0f, 7.974f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 12.5f, 18.2143f, 13.5911f, 17.3214f, 14.1576f)
                curveTo(15.9983f, 14.8192f, 14.118f, 15.25f, 12.0f, 15.25f)
                curveTo(9.882f, 15.25f, 8.0017f, 14.8192f, 6.6786f, 14.1576f)
                curveTo(5.5f, 13.5683f, 4.0f, 12.5f, 4.0f, 12.0f)
                verticalLineTo(7.974f)
                curveTo(4.5022f, 8.5906f, 5.215f, 9.1028f, 6.0077f, 9.4993f)
                curveTo(7.58f, 10.2854f, 9.6997f, 10.75f, 12.0f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.3214f, 8.1576f)
                curveTo(15.9983f, 8.8192f, 14.118f, 9.25f, 12.0f, 9.25f)
                curveTo(9.882f, 9.25f, 8.0017f, 8.8192f, 6.6786f, 8.1576f)
                curveTo(6.1638f, 7.956f, 5.0064f, 7.3149f, 4.2015f, 6.2793f)
                curveTo(4.0645f, 6.1031f, 4.0058f, 5.8785f, 4.0399f, 5.658f)
                curveTo(4.0628f, 5.5097f, 4.0948f, 5.3569f, 4.1358f, 5.2623f)
                curveTo(4.8281f, 3.4055f, 8.0858f, 2.0f, 12.0f, 2.0f)
                curveTo(15.9142f, 2.0f, 19.1718f, 3.4055f, 19.8642f, 5.2623f)
                curveTo(19.9052f, 5.3569f, 19.9372f, 5.5097f, 19.9601f, 5.658f)
                curveTo(19.9942f, 5.8785f, 19.9355f, 6.1031f, 19.7985f, 6.2793f)
                curveTo(18.9936f, 7.3149f, 17.8362f, 7.956f, 17.3214f, 8.1576f)
                close()
            }
        }
            .build()
        return _database!!
    }

private var _database: ImageVector? = null
