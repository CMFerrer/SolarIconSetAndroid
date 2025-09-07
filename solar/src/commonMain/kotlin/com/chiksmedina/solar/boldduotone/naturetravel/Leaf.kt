package com.chiksmedina.solar.boldduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NatureTravelGroup

val NatureTravelGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(
            name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 18.3541f, 4.0f, 13.8567f)
                curveTo(4.0f, 9.3945f, 6.5533f, 4.1876f, 10.5371f, 2.3256f)
                curveTo(11.0014f, 2.1085f, 11.5007f, 2.0f, 12.0f, 2.0f)
                verticalLineTo(22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.4629f, 2.3256f)
                curveTo(12.9986f, 2.1085f, 12.4993f, 2.0f, 12.0f, 2.0f)
                verticalLineTo(9.0001f)
                lineTo(16.4317f, 4.5684f)
                curveTo(15.5689f, 3.6206f, 14.5713f, 2.8436f, 13.4629f, 2.3256f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(14.5f)
                lineTo(18.6142f, 7.8857f)
                curveTo(18.0421f, 6.6655f, 17.3062f, 5.5292f, 16.4317f, 4.5684f)
                lineTo(12.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.5f)
                lineTo(19.811f, 11.689f)
                curveTo(19.5911f, 10.3986f, 19.1838f, 9.1006f, 18.6142f, 7.8857f)
                lineTo(12.0f, 14.5f)
                verticalLineTo(19.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.811f, 11.689f)
                lineTo(12.0f, 19.5f)
                verticalLineTo(21.9999f)
                curveTo(16.4183f, 21.9999f, 20.0f, 18.354f, 20.0f, 13.8566f)
                curveTo(20.0f, 13.1474f, 19.9355f, 12.4194f, 19.811f, 11.689f)
                close()
            }
        }
            .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
