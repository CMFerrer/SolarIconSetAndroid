package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.ShareCircle: ImageVector
    get() {
        if (_shareCircle != null) {
            return _shareCircle!!
        }
        _shareCircle = Builder(
            name = "ShareCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.75f, 6.0f)
                curveTo(15.75f, 3.9289f, 14.0711f, 2.25f, 12.0f, 2.25f)
                curveTo(9.9289f, 2.25f, 8.25f, 3.9289f, 8.25f, 6.0f)
                curveTo(8.25f, 8.0711f, 9.9289f, 9.75f, 12.0f, 9.75f)
                curveTo(14.0711f, 9.75f, 15.75f, 8.0711f, 15.75f, 6.0f)
                close()
                moveTo(12.0f, 3.75f)
                curveTo(13.2426f, 3.75f, 14.25f, 4.7574f, 14.25f, 6.0f)
                curveTo(14.25f, 7.2426f, 13.2426f, 8.25f, 12.0f, 8.25f)
                curveTo(10.7574f, 8.25f, 9.75f, 7.2426f, 9.75f, 6.0f)
                curveTo(9.75f, 4.7574f, 10.7574f, 3.75f, 12.0f, 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 18.0f)
                curveTo(9.25f, 15.9289f, 7.5711f, 14.25f, 5.5f, 14.25f)
                curveTo(3.4289f, 14.25f, 1.75f, 15.9289f, 1.75f, 18.0f)
                curveTo(1.75f, 20.0711f, 3.4289f, 21.75f, 5.5f, 21.75f)
                curveTo(7.5711f, 21.75f, 9.25f, 20.0711f, 9.25f, 18.0f)
                close()
                moveTo(5.5f, 15.75f)
                curveTo(6.7426f, 15.75f, 7.75f, 16.7574f, 7.75f, 18.0f)
                curveTo(7.75f, 19.2426f, 6.7426f, 20.25f, 5.5f, 20.25f)
                curveTo(4.2574f, 20.25f, 3.25f, 19.2426f, 3.25f, 18.0f)
                curveTo(3.25f, 16.7574f, 4.2574f, 15.75f, 5.5f, 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.5f, 14.25f)
                curveTo(20.5711f, 14.25f, 22.25f, 15.9289f, 22.25f, 18.0f)
                curveTo(22.25f, 20.0711f, 20.5711f, 21.75f, 18.5f, 21.75f)
                curveTo(16.4289f, 21.75f, 14.75f, 20.0711f, 14.75f, 18.0f)
                curveTo(14.75f, 15.9289f, 16.4289f, 14.25f, 18.5f, 14.25f)
                close()
                moveTo(20.75f, 18.0f)
                curveTo(20.75f, 16.7574f, 19.7426f, 15.75f, 18.5f, 15.75f)
                curveTo(17.2574f, 15.75f, 16.25f, 16.7574f, 16.25f, 18.0f)
                curveTo(16.25f, 19.2426f, 17.2574f, 20.25f, 18.5f, 20.25f)
                curveTo(19.7426f, 20.25f, 20.75f, 19.2426f, 20.75f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.2047f, 7.5623f)
                curveTo(7.5152f, 7.2882f, 7.5448f, 6.8143f, 7.2707f, 6.5037f)
                curveTo(6.9966f, 6.1932f, 6.5226f, 6.1636f, 6.2121f, 6.4377f)
                curveTo(4.3968f, 8.0399f, 3.25f, 10.3865f, 3.25f, 13.0f)
                curveTo(3.25f, 13.4142f, 3.5858f, 13.75f, 4.0f, 13.75f)
                curveTo(4.4142f, 13.75f, 4.75f, 13.4142f, 4.75f, 13.0f)
                curveTo(4.75f, 10.8347f, 5.6983f, 8.8919f, 7.2047f, 7.5623f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.7879f, 6.4377f)
                curveTo(17.4774f, 6.1636f, 17.0034f, 6.1932f, 16.7293f, 6.5037f)
                curveTo(16.4552f, 6.8143f, 16.4848f, 7.2882f, 16.7953f, 7.5623f)
                curveTo(18.3017f, 8.8919f, 19.25f, 10.8347f, 19.25f, 13.0f)
                curveTo(19.25f, 13.4142f, 19.5858f, 13.75f, 20.0f, 13.75f)
                curveTo(20.4142f, 13.75f, 20.75f, 13.4142f, 20.75f, 13.0f)
                curveTo(20.75f, 10.3865f, 19.6032f, 8.0399f, 17.7879f, 6.4377f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.1869f, 20.0217f)
                curveTo(9.7858f, 19.9184f, 9.3769f, 20.1599f, 9.2737f, 20.561f)
                curveTo(9.1704f, 20.9622f, 9.4119f, 21.3711f, 9.8131f, 21.4743f)
                curveTo(10.5129f, 21.6544f, 11.2458f, 21.75f, 12.0f, 21.75f)
                curveTo(12.7542f, 21.75f, 13.4871f, 21.6544f, 14.1869f, 21.4743f)
                curveTo(14.5881f, 21.3711f, 14.8296f, 20.9622f, 14.7263f, 20.561f)
                curveTo(14.6231f, 20.1599f, 14.2142f, 19.9184f, 13.8131f, 20.0217f)
                curveTo(13.2344f, 20.1706f, 12.627f, 20.25f, 12.0f, 20.25f)
                curveTo(11.373f, 20.25f, 10.7656f, 20.1706f, 10.1869f, 20.0217f)
                close()
            }
        }
            .build()
        return _shareCircle!!
    }

private var _shareCircle: ImageVector? = null
