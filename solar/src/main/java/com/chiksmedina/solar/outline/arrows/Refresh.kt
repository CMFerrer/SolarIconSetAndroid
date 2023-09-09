package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

public val ArrowsGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.9308f, 11.2003f)
                curveTo(3.0024f, 6.2397f, 7.0762f, 2.25f, 12.0789f, 2.25f)
                curveTo(15.3873f, 2.25f, 18.287f, 3.9943f, 19.8934f, 6.6072f)
                curveTo(20.1103f, 6.9601f, 20.0001f, 7.422f, 19.6473f, 7.6389f)
                curveTo(19.2944f, 7.8559f, 18.8325f, 7.7456f, 18.6156f, 7.3928f)
                curveTo(17.2727f, 5.2084f, 14.8484f, 3.75f, 12.0789f, 3.75f)
                curveTo(7.8945f, 3.75f, 4.5037f, 7.0777f, 4.431f, 11.1982f)
                lineTo(4.8314f, 10.8009f)
                curveTo(5.1254f, 10.5092f, 5.6003f, 10.511f, 5.892f, 10.8051f)
                curveTo(6.1838f, 11.0991f, 6.1819f, 11.574f, 5.8879f, 11.8657f)
                lineTo(4.208f, 13.5324f)
                curveTo(3.9156f, 13.8225f, 3.444f, 13.8225f, 3.1516f, 13.5324f)
                lineTo(1.4718f, 11.8657f)
                curveTo(1.1777f, 11.574f, 1.1759f, 11.0991f, 1.4676f, 10.8051f)
                curveTo(1.7593f, 10.5111f, 2.2342f, 10.5092f, 2.5282f, 10.8009f)
                lineTo(2.9308f, 11.2003f)
                close()
                moveTo(19.7864f, 10.4666f)
                curveTo(20.0786f, 10.1778f, 20.5487f, 10.1778f, 20.8409f, 10.4666f)
                lineTo(22.5271f, 12.1333f)
                curveTo(22.8217f, 12.4244f, 22.8245f, 12.8993f, 22.5333f, 13.1939f)
                curveTo(22.2421f, 13.4885f, 21.7673f, 13.4913f, 21.4727f, 13.2001f)
                lineTo(21.0628f, 12.7949f)
                curveTo(20.9934f, 17.7604f, 16.9017f, 21.75f, 11.8825f, 21.75f)
                curveTo(8.5638f, 21.75f, 5.6538f, 20.007f, 4.0412f, 17.3939f)
                curveTo(3.8237f, 17.0414f, 3.9331f, 16.5793f, 4.2856f, 16.3618f)
                curveTo(4.6381f, 16.1442f, 5.1002f, 16.2536f, 5.3177f, 16.6061f)
                curveTo(6.6656f, 18.7903f, 9.1f, 20.25f, 11.8825f, 20.25f)
                curveTo(16.0887f, 20.25f, 19.4922f, 16.9171f, 19.5625f, 12.7969f)
                lineTo(19.1546f, 13.2001f)
                curveTo(18.86f, 13.4913f, 18.3852f, 13.4885f, 18.094f, 13.1939f)
                curveTo(17.8028f, 12.8993f, 17.8056f, 12.4244f, 18.1002f, 12.1333f)
                lineTo(19.7864f, 10.4666f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
