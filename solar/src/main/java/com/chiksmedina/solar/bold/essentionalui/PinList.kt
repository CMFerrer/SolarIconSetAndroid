package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.PinList: ImageVector
    get() {
        if (_pinList != null) {
            return _pinList!!
        }
        _pinList = Builder(name = "PinList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 8.3769f)
                curveTo(22.0f, 8.7809f, 21.6668f, 9.1084f, 21.2557f, 9.1084f)
                horizontalLineTo(16.2937f)
                curveTo(15.8826f, 9.1084f, 15.5494f, 8.7809f, 15.5494f, 8.3769f)
                curveTo(15.5494f, 7.9729f, 15.8826f, 7.6454f, 16.2937f, 7.6454f)
                horizontalLineTo(21.2557f)
                curveTo(21.6668f, 7.6454f, 22.0f, 7.9729f, 22.0f, 8.3769f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.7658f)
                curveTo(22.0f, 13.1698f, 21.6668f, 13.4973f, 21.2557f, 13.4973f)
                horizontalLineTo(17.2861f)
                curveTo(16.875f, 13.4973f, 16.5418f, 13.1698f, 16.5418f, 12.7658f)
                curveTo(16.5418f, 12.3618f, 16.875f, 12.0343f, 17.2861f, 12.0343f)
                horizontalLineTo(21.2557f)
                curveTo(21.6668f, 12.0343f, 22.0f, 12.3618f, 22.0f, 12.7658f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5872f, 8.2378f)
                lineTo(12.9508f, 8.5951f)
                curveTo(14.4693f, 10.0875f, 15.2285f, 10.8336f, 15.2278f, 11.6425f)
                curveTo(15.2276f, 11.9068f, 15.1728f, 12.1682f, 15.0666f, 12.411f)
                curveTo(14.7417f, 13.1542f, 13.7441f, 13.5444f, 11.7489f, 14.3248f)
                lineTo(11.6045f, 14.3813f)
                curveTo(11.0389f, 14.6025f, 10.7561f, 14.7132f, 10.5279f, 14.8908f)
                curveTo(10.3548f, 15.0256f, 10.2058f, 15.1878f, 10.0871f, 15.3708f)
                curveTo(9.9306f, 15.6119f, 9.8475f, 15.8997f, 9.6812f, 16.4753f)
                curveTo(9.4235f, 17.3678f, 9.2946f, 17.8141f, 9.0198f, 18.0121f)
                curveTo(8.8155f, 18.1593f, 8.5617f, 18.2242f, 8.3104f, 18.1934f)
                curveTo(7.9722f, 18.1521f, 7.6385f, 17.8241f, 6.9709f, 17.168f)
                lineTo(5.9439f, 16.1586f)
                lineTo(3.2706f, 18.7858f)
                curveTo(2.9799f, 19.0714f, 2.5087f, 19.0714f, 2.218f, 18.7858f)
                curveTo(1.9273f, 18.5001f, 1.9273f, 18.0369f, 2.218f, 17.7513f)
                lineTo(4.8812f, 15.1143f)
                lineTo(3.8642f, 14.1148f)
                curveTo(3.1967f, 13.4588f, 2.8629f, 13.1307f, 2.8208f, 12.7984f)
                curveTo(2.7896f, 12.5514f, 2.8556f, 12.302f, 3.0053f, 12.1012f)
                curveTo(3.2068f, 11.8311f, 3.6609f, 11.7045f, 4.5691f, 11.4511f)
                curveTo(5.1547f, 11.2878f, 5.4476f, 11.2061f, 5.693f, 11.0523f)
                curveTo(5.8791f, 10.9356f, 6.0442f, 10.7891f, 6.1813f, 10.619f)
                curveTo(6.3621f, 10.3948f, 6.4746f, 10.1168f, 6.6998f, 9.5609f)
                lineTo(6.7572f, 9.419f)
                curveTo(7.5513f, 7.4582f, 7.9483f, 6.4777f, 8.7046f, 6.1584f)
                curveTo(8.9516f, 6.0541f, 9.2176f, 6.0002f, 9.4865f, 6.0f)
                curveTo(10.3096f, 5.9993f, 11.0688f, 6.7455f, 12.5872f, 8.2378f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 17.1547f)
                curveTo(22.0f, 17.5587f, 21.6668f, 17.8862f, 21.2557f, 17.8862f)
                horizontalLineTo(12.3241f)
                curveTo(11.9131f, 17.8862f, 11.5798f, 17.5587f, 11.5798f, 17.1547f)
                curveTo(11.5798f, 16.7507f, 11.9131f, 16.4232f, 12.3241f, 16.4232f)
                horizontalLineTo(21.2557f)
                curveTo(21.6668f, 16.4232f, 22.0f, 16.7507f, 22.0f, 17.1547f)
                close()
            }
        }
        .build()
        return _pinList!!
    }

private var _pinList: ImageVector? = null
