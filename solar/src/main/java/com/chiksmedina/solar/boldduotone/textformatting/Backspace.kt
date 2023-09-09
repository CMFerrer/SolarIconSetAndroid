package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

public val TextFormattingGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8711f, 19.4986f)
                curveTo(7.8008f, 20.0f, 8.9146f, 20.0f, 11.142f, 20.0f)
                horizontalLineTo(13.779f)
                curveTo(17.6544f, 20.0f, 19.5921f, 20.0f, 20.7961f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.7961f, 5.1716f)
                curveTo(19.5921f, 4.0f, 17.6544f, 4.0f, 13.779f, 4.0f)
                horizontalLineTo(11.142f)
                curveTo(8.9146f, 4.0f, 7.8008f, 4.0f, 6.8711f, 4.5014f)
                curveTo(5.9414f, 5.0029f, 5.3512f, 5.9219f, 4.1706f, 7.76f)
                lineTo(3.4898f, 8.82f)
                curveTo(2.4966f, 10.3664f, 2.0f, 11.1396f, 2.0f, 12.0f)
                curveTo(2.0f, 12.8604f, 2.4966f, 13.6336f, 3.4898f, 15.18f)
                lineTo(4.1706f, 16.24f)
                curveTo(5.3512f, 18.0781f, 5.9414f, 18.9971f, 6.8711f, 19.4986f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0303f, 8.9697f)
                curveTo(10.7374f, 8.6768f, 10.2626f, 8.6768f, 9.9697f, 8.9697f)
                curveTo(9.6768f, 9.2626f, 9.6768f, 9.7374f, 9.9697f, 10.0303f)
                lineTo(11.9394f, 12.0f)
                lineTo(9.9697f, 13.9697f)
                curveTo(9.6768f, 14.2626f, 9.6768f, 14.7374f, 9.9697f, 15.0303f)
                curveTo(10.2626f, 15.3232f, 10.7375f, 15.3232f, 11.0304f, 15.0303f)
                lineTo(13.0f, 13.0607f)
                lineTo(14.9696f, 15.0303f)
                curveTo(15.2625f, 15.3232f, 15.7374f, 15.3232f, 16.0303f, 15.0303f)
                curveTo(16.3232f, 14.7374f, 16.3232f, 14.2625f, 16.0303f, 13.9697f)
                lineTo(14.0607f, 12.0f)
                lineTo(16.0303f, 10.0304f)
                curveTo(16.3232f, 9.7375f, 16.3232f, 9.2626f, 16.0303f, 8.9697f)
                curveTo(15.7374f, 8.6768f, 15.2626f, 8.6768f, 14.9697f, 8.9697f)
                lineTo(13.0f, 10.9394f)
                lineTo(11.0303f, 8.9697f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
