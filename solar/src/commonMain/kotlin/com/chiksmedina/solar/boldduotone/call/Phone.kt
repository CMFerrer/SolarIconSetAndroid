package com.chiksmedina.solar.boldduotone.call

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
import com.chiksmedina.solar.boldduotone.CallGroup

val CallGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(
            name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.1007f, 13.359f)
                lineTo(16.5562f, 12.9062f)
                curveTo(17.1858f, 12.2801f, 18.1672f, 12.1515f, 18.9728f, 12.5894f)
                lineTo(20.8833f, 13.628f)
                curveTo(22.1102f, 14.2949f, 22.3806f, 15.9295f, 21.4217f, 16.883f)
                lineTo(20.0011f, 18.2954f)
                curveTo(19.6399f, 18.6546f, 19.1917f, 18.9171f, 18.6763f, 18.9651f)
                curveTo(17.4841f, 19.0763f, 15.0313f, 19.0163f, 12.1374f, 17.3223f)
                lineTo(16.1007f, 13.359f)
                close()
                moveTo(10.1907f, 7.4826f)
                lineTo(10.4775f, 7.1974f)
                curveTo(11.1841f, 6.4948f, 11.2507f, 5.3669f, 10.6342f, 4.5435f)
                lineTo(9.3733f, 2.8591f)
                curveTo(8.6103f, 1.8399f, 7.136f, 1.7053f, 6.2614f, 2.5748f)
                lineTo(4.6919f, 4.1355f)
                curveTo(4.2582f, 4.5667f, 3.9676f, 5.1256f, 4.0029f, 5.7456f)
                curveTo(4.0676f, 6.8845f, 4.4558f, 8.9649f, 6.1518f, 11.5215f)
                lineTo(10.1907f, 7.4826f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0627f, 11.4973f)
                curveTo(9.117f, 8.5683f, 10.1836f, 7.4894f, 10.1903f, 7.4827f)
                lineTo(6.1514f, 11.5216f)
                curveTo(6.8176f, 12.5259f, 7.6855f, 13.6036f, 8.815f, 14.7267f)
                curveTo(9.9547f, 15.8599f, 11.0755f, 16.7011f, 12.137f, 17.3224f)
                lineTo(16.1003f, 13.3591f)
                curveTo(16.1003f, 13.3591f, 15.0177f, 14.4356f, 12.0627f, 11.4973f)
                close()
            }
        }
            .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
