package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.BoxMinimalistic: ImageVector
    get() {
        if (_boxMinimalistic != null) {
            return _boxMinimalistic!!
        }
        _boxMinimalistic = Builder(
            name = "BoxMinimalistic", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4223f, 20.618f)
                curveTo(10.1779f, 21.5393f, 11.0557f, 22.0f, 12.0f, 22.0f)
                verticalLineTo(12.0f)
                lineTo(2.638f, 7.0726f)
                curveTo(2.6242f, 7.0948f, 2.6107f, 7.1171f, 2.5974f, 7.1397f)
                curveTo(2.0f, 8.1542f, 2.0f, 9.4167f, 2.0f, 11.9415f)
                verticalLineTo(12.0585f)
                curveTo(2.0f, 14.5833f, 2.0f, 15.8457f, 2.5974f, 16.8603f)
                curveTo(3.1948f, 17.8748f, 4.2706f, 18.4393f, 6.4223f, 19.5685f)
                lineTo(8.4223f, 20.618f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5774f, 4.4315f)
                lineTo(15.5774f, 3.382f)
                curveTo(13.8218f, 2.4607f, 12.944f, 2.0f, 11.9997f, 2.0f)
                curveTo(11.0554f, 2.0f, 10.1776f, 2.4607f, 8.422f, 3.382f)
                lineTo(6.422f, 4.4315f)
                curveTo(4.3182f, 5.5355f, 3.2429f, 6.0998f, 2.6377f, 7.0726f)
                lineTo(11.9997f, 12.0f)
                lineTo(21.3617f, 7.0726f)
                curveTo(20.7564f, 6.0998f, 19.6811f, 5.5355f, 17.5774f, 4.4315f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.4026f, 7.1399f)
                curveTo(21.3893f, 7.1173f, 21.3758f, 7.0949f, 21.362f, 7.0728f)
                lineTo(12.0f, 12.0001f)
                verticalLineTo(22.0001f)
                curveTo(12.9443f, 22.0001f, 13.8221f, 21.5395f, 15.5777f, 20.6181f)
                lineTo(17.5777f, 19.5686f)
                curveTo(19.7294f, 18.4395f, 20.8052f, 17.8749f, 21.4026f, 16.8604f)
                curveTo(22.0f, 15.8459f, 22.0f, 14.5834f, 22.0f, 12.0586f)
                verticalLineTo(11.9416f)
                curveTo(22.0f, 9.4168f, 22.0f, 8.1544f, 21.4026f, 7.1399f)
                close()
            }
        }
            .build()
        return _boxMinimalistic!!
    }

private var _boxMinimalistic: ImageVector? = null
