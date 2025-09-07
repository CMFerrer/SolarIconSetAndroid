package com.chiksmedina.solar.boldduotone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.CallGroup

val CallGroup.CallChat: ImageVector
    get() {
        if (_callChat != null) {
            return _callChat!!
        }
        _callChat = Builder(
            name = "CallChat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5562f, 15.5477f)
                lineTo(14.1007f, 16.0272f)
                curveTo(14.1007f, 16.0272f, 13.0181f, 17.167f, 10.0631f, 14.0559f)
                curveTo(7.1081f, 10.9448f, 8.1907f, 9.8051f, 8.1907f, 9.8051f)
                lineTo(8.4775f, 9.5031f)
                curveTo(9.1841f, 8.7592f, 9.2507f, 7.565f, 8.6342f, 6.6931f)
                lineTo(7.3733f, 4.9096f)
                curveTo(6.6103f, 3.8305f, 5.136f, 3.6879f, 4.2614f, 4.6086f)
                lineTo(2.6918f, 6.2611f)
                curveTo(2.2582f, 6.7177f, 1.9677f, 7.3095f, 2.0029f, 7.9659f)
                curveTo(2.093f, 9.6455f, 2.8107f, 13.259f, 6.8154f, 17.4752f)
                curveTo(11.0621f, 21.9462f, 15.0468f, 22.1239f, 16.6763f, 21.9631f)
                curveTo(17.1917f, 21.9122f, 17.6399f, 21.6343f, 18.0011f, 21.254f)
                lineTo(19.4217f, 19.7584f)
                curveTo(20.3806f, 18.7489f, 20.1102f, 17.0182f, 18.8833f, 16.312f)
                lineTo(16.9728f, 15.2123f)
                curveTo(16.1672f, 14.7486f, 15.1858f, 14.8848f, 14.5562f, 15.5477f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 12.0f)
                curveTo(19.7614f, 12.0f, 22.0f, 9.7614f, 22.0f, 7.0f)
                curveTo(22.0f, 4.2386f, 19.7614f, 2.0f, 17.0f, 2.0f)
                curveTo(14.2386f, 2.0f, 12.0f, 4.2386f, 12.0f, 7.0f)
                curveTo(12.0f, 7.7998f, 12.1878f, 8.5558f, 12.5217f, 9.2262f)
                curveTo(12.6105f, 9.4044f, 12.64f, 9.608f, 12.5886f, 9.8003f)
                lineTo(12.2908f, 10.9133f)
                curveTo(12.1615f, 11.3965f, 12.6035f, 11.8385f, 13.0867f, 11.7092f)
                lineTo(14.1997f, 11.4114f)
                curveTo(14.392f, 11.36f, 14.5956f, 11.3895f, 14.7738f, 11.4783f)
                curveTo(15.4442f, 11.8122f, 16.2002f, 12.0f, 17.0f, 12.0f)
                close()
            }
        }
            .build()
        return _callChat!!
    }

private var _callChat: ImageVector? = null
