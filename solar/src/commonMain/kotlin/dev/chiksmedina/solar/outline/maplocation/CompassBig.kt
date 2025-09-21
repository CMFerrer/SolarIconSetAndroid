package dev.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.CompassBig: ImageVector
    get() {
        if (_compassBig != null) {
            return _compassBig!!
        }
        _compassBig = Builder(
            name = "CompassBig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.7059f, 3.0714f)
                curveTo(14.9631f, 3.5335f, 12.6544f, 4.4555f, 9.4887f, 5.7218f)
                curveTo(8.0978f, 6.2781f, 7.5723f, 6.4991f, 7.165f, 6.8563f)
                curveTo(7.0554f, 6.9523f, 6.9523f, 7.0554f, 6.8563f, 7.165f)
                curveTo(6.4991f, 7.5723f, 6.2781f, 8.0978f, 5.7218f, 9.4887f)
                curveTo(4.4555f, 12.6544f, 3.5335f, 14.9631f, 3.0714f, 16.7059f)
                curveTo(2.6028f, 18.4736f, 2.6788f, 19.4168f, 3.0915f, 20.0242f)
                curveTo(3.3279f, 20.3721f, 3.6279f, 20.6721f, 3.9758f, 20.9085f)
                curveTo(4.5832f, 21.3212f, 5.5264f, 21.3972f, 7.2941f, 20.9285f)
                curveTo(9.0369f, 20.4665f, 11.3456f, 19.5445f, 14.5113f, 18.2782f)
                curveTo(15.9022f, 17.7219f, 16.4277f, 17.5009f, 16.835f, 17.1437f)
                lineTo(17.2938f, 17.6669f)
                lineTo(16.835f, 17.1437f)
                curveTo(16.9445f, 17.0477f, 17.0477f, 16.9445f, 17.1437f, 16.835f)
                lineTo(17.6726f, 17.2988f)
                lineTo(17.1437f, 16.835f)
                curveTo(17.5009f, 16.4277f, 17.7219f, 15.9022f, 18.2782f, 14.5113f)
                curveTo(19.5445f, 11.3456f, 20.4665f, 9.0369f, 20.9285f, 7.2941f)
                curveTo(21.3972f, 5.5264f, 21.3212f, 4.5832f, 20.9085f, 3.9758f)
                curveTo(20.6721f, 3.6279f, 20.3721f, 3.3279f, 20.0242f, 3.0915f)
                curveTo(19.4168f, 2.6788f, 18.4736f, 2.6028f, 16.7059f, 3.0714f)
                close()
                moveTo(16.3215f, 1.6215f)
                curveTo(18.1492f, 1.137f, 19.6776f, 1.0424f, 20.8672f, 1.8508f)
                curveTo(21.3715f, 2.1935f, 21.8065f, 2.6284f, 22.1491f, 3.1327f)
                curveTo(22.9576f, 4.3224f, 22.863f, 5.8508f, 22.3784f, 7.6785f)
                curveTo(21.8901f, 9.5204f, 20.9328f, 11.9137f, 19.6927f, 15.0139f)
                lineTo(19.6709f, 15.0684f)
                curveTo(19.6539f, 15.111f, 19.637f, 15.1532f, 19.6204f, 15.1948f)
                curveTo(19.1325f, 16.4154f, 18.819f, 17.1997f, 18.2715f, 17.824f)
                curveTo(18.1323f, 17.9828f, 17.9828f, 18.1323f, 17.824f, 18.2715f)
                curveTo(17.1997f, 18.819f, 16.4154f, 19.1325f, 15.1948f, 19.6204f)
                curveTo(15.1532f, 19.637f, 15.111f, 19.6539f, 15.0684f, 19.6709f)
                lineTo(15.0139f, 19.6927f)
                curveTo(11.9137f, 20.9328f, 9.5204f, 21.8901f, 7.6785f, 22.3784f)
                curveTo(5.8508f, 22.863f, 4.3224f, 22.9576f, 3.1327f, 22.1491f)
                curveTo(2.6284f, 21.8065f, 2.1935f, 21.3715f, 1.8508f, 20.8672f)
                lineTo(2.4712f, 20.4457f)
                lineTo(1.8508f, 20.8672f)
                curveTo(1.0424f, 19.6776f, 1.137f, 18.1492f, 1.6215f, 16.3215f)
                curveTo(2.1098f, 14.4796f, 3.0672f, 12.0863f, 4.3073f, 8.986f)
                lineTo(4.3291f, 8.9316f)
                curveTo(4.3461f, 8.889f, 4.363f, 8.8468f, 4.3796f, 8.8052f)
                curveTo(4.8675f, 7.5845f, 5.181f, 6.8003f, 5.7285f, 6.176f)
                curveTo(5.8677f, 6.0172f, 6.0172f, 5.8677f, 6.176f, 5.7285f)
                curveTo(6.8003f, 5.181f, 7.5845f, 4.8675f, 8.8052f, 4.3796f)
                curveTo(8.8468f, 4.363f, 8.889f, 4.3461f, 8.9316f, 4.3291f)
                lineTo(8.986f, 4.3073f)
                curveTo(12.0863f, 3.0672f, 14.4796f, 2.1098f, 16.3215f, 1.6215f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7573f, 9.75f, 9.75f, 10.7573f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7573f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7573f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
            }
        }
            .build()
        return _compassBig!!
    }

private var _compassBig: ImageVector? = null
