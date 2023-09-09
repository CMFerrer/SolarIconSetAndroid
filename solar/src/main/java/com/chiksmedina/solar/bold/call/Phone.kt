package com.chiksmedina.solar.bold.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.CallGroup

public val CallGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5562f, 12.9062f)
                lineTo(16.1007f, 13.359f)
                curveTo(16.1007f, 13.359f, 15.0181f, 14.4355f, 12.0631f, 11.4972f)
                curveTo(9.1081f, 8.559f, 10.1907f, 7.4826f, 10.1907f, 7.4826f)
                lineTo(10.4775f, 7.1974f)
                curveTo(11.1841f, 6.4948f, 11.2507f, 5.3669f, 10.6342f, 4.5435f)
                lineTo(9.3733f, 2.8591f)
                curveTo(8.6103f, 1.8399f, 7.136f, 1.7053f, 6.2614f, 2.5748f)
                lineTo(4.6919f, 4.1355f)
                curveTo(4.2582f, 4.5667f, 3.9676f, 5.1256f, 4.0029f, 5.7456f)
                curveTo(4.093f, 7.3318f, 4.8107f, 10.7447f, 8.8154f, 14.7266f)
                curveTo(13.0621f, 18.9492f, 17.0468f, 19.117f, 18.6763f, 18.9651f)
                curveTo(19.1917f, 18.9171f, 19.6399f, 18.6546f, 20.0011f, 18.2954f)
                lineTo(21.4217f, 16.883f)
                curveTo(22.3806f, 15.9295f, 22.1102f, 14.2949f, 20.8833f, 13.628f)
                lineTo(18.9728f, 12.5894f)
                curveTo(18.1672f, 12.1515f, 17.1858f, 12.2801f, 16.5562f, 12.9062f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
