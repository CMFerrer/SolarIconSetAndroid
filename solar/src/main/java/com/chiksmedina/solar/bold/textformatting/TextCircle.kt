package com.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TextFormattingGroup

public val TextFormattingGroup.TextCircle: ImageVector
    get() {
        if (_textCircle != null) {
            return _textCircle!!
        }
        _textCircle = Builder(name = "TextCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.952f, 6.25f)
                curveTo(9.5221f, 6.2499f, 9.1202f, 6.2499f, 8.7919f, 6.2989f)
                curveTo(8.421f, 6.3543f, 8.04f, 6.4853f, 7.7354f, 6.8237f)
                curveTo(7.441f, 7.1508f, 7.3371f, 7.5406f, 7.292f, 7.9129f)
                curveTo(7.2499f, 8.261f, 7.25f, 8.6924f, 7.25f, 9.1795f)
                lineTo(7.25f, 9.75f)
                curveTo(7.25f, 10.1642f, 7.5858f, 10.5f, 8.0f, 10.5f)
                curveTo(8.4142f, 10.5f, 8.75f, 10.1642f, 8.75f, 9.75f)
                verticalLineTo(9.2222f)
                curveTo(8.75f, 8.6793f, 8.7513f, 8.3401f, 8.7812f, 8.0931f)
                curveTo(8.7952f, 7.9773f, 8.8127f, 7.9105f, 8.8269f, 7.8722f)
                curveTo(8.8389f, 7.8399f, 8.8474f, 7.8305f, 8.8502f, 7.8273f)
                lineTo(8.851f, 7.8264f)
                curveTo(8.8524f, 7.8247f, 8.8534f, 7.8235f, 8.8624f, 7.8194f)
                curveTo(8.879f, 7.8118f, 8.9217f, 7.7962f, 9.0135f, 7.7825f)
                curveTo(9.2177f, 7.752f, 9.5051f, 7.75f, 10.0f, 7.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.25f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 16.25f, 8.75f, 16.5858f, 8.75f, 17.0f)
                curveTo(8.75f, 17.4142f, 9.0858f, 17.75f, 9.5f, 17.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 17.75f, 15.75f, 17.4142f, 15.75f, 17.0f)
                curveTo(15.75f, 16.5858f, 15.4142f, 16.25f, 15.0f, 16.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(7.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4949f, 7.75f, 14.7824f, 7.752f, 14.9865f, 7.7825f)
                curveTo(15.0783f, 7.7962f, 15.121f, 7.8118f, 15.1376f, 7.8194f)
                curveTo(15.1466f, 7.8235f, 15.1476f, 7.8247f, 15.149f, 7.8264f)
                lineTo(15.1496f, 7.8272f)
                curveTo(15.1525f, 7.8303f, 15.1611f, 7.8399f, 15.1731f, 7.8722f)
                curveTo(15.1873f, 7.9105f, 15.2048f, 7.9773f, 15.2188f, 8.0931f)
                curveTo(15.2487f, 8.3401f, 15.25f, 8.6793f, 15.25f, 9.2222f)
                verticalLineTo(9.75f)
                curveTo(15.25f, 10.1642f, 15.5858f, 10.5f, 16.0f, 10.5f)
                curveTo(16.4142f, 10.5f, 16.75f, 10.1642f, 16.75f, 9.75f)
                lineTo(16.75f, 9.1795f)
                curveTo(16.75f, 8.6924f, 16.7501f, 8.261f, 16.708f, 7.9129f)
                curveTo(16.6629f, 7.5406f, 16.559f, 7.1508f, 16.2646f, 6.8237f)
                curveTo(15.96f, 6.4853f, 15.579f, 6.3543f, 15.2081f, 6.2989f)
                curveTo(14.8798f, 6.2499f, 14.4779f, 6.2499f, 14.048f, 6.25f)
                horizontalLineTo(9.952f)
                close()
            }
        }
        .build()
        return _textCircle!!
    }

private var _textCircle: ImageVector? = null
