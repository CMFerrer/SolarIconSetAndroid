package com.chiksmedina.solar.linear.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.TextFormattingGroup

public val TextFormattingGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.142f, 20.0f)
                curveTo(8.9146f, 20.0f, 7.8008f, 20.0f, 6.8711f, 19.4986f)
                curveTo(5.9414f, 18.9971f, 5.3512f, 18.0781f, 4.1706f, 16.24f)
                lineTo(3.4898f, 15.18f)
                curveTo(2.4966f, 13.6336f, 2.0f, 12.8604f, 2.0f, 12.0f)
                curveTo(2.0f, 11.1396f, 2.4966f, 10.3664f, 3.4898f, 8.82f)
                lineTo(4.1706f, 7.76f)
                curveTo(5.3512f, 5.9219f, 5.9414f, 5.0029f, 6.8711f, 4.5014f)
                curveTo(7.8008f, 4.0f, 8.9146f, 4.0f, 11.142f, 4.0f)
                lineTo(13.779f, 4.0f)
                curveTo(17.6544f, 4.0f, 19.5921f, 4.0f, 20.7961f, 5.1716f)
                curveTo(22.0f, 6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.7961f, 18.8284f)
                curveTo(19.5921f, 20.0f, 17.6544f, 20.0f, 13.779f, 20.0f)
                horizontalLineTo(11.142f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.5f)
                lineTo(10.5f, 14.5f)
                moveTo(10.5f, 9.5f)
                lineTo(15.5f, 14.5f)
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
