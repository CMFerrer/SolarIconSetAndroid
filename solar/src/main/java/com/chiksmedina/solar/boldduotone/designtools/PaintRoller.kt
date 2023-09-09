package com.chiksmedina.solar.boldduotone.designtools

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
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) {
            return _paintRoller!!
        }
        _paintRoller = Builder(name = "PaintRoller", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                curveTo(6.0f, 3.5654f, 6.0f, 3.0981f, 6.201f, 2.75f)
                curveTo(6.3326f, 2.522f, 6.522f, 2.3326f, 6.75f, 2.201f)
                curveTo(7.0981f, 2.0f, 7.5654f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(15.5f)
                curveTo(16.4346f, 2.0f, 16.9019f, 2.0f, 17.25f, 2.201f)
                curveTo(17.478f, 2.3326f, 17.6674f, 2.522f, 17.799f, 2.75f)
                curveTo(18.0f, 3.0981f, 18.0f, 3.5654f, 18.0f, 4.5f)
                curveTo(18.0f, 5.4346f, 18.0f, 5.9019f, 17.799f, 6.25f)
                curveTo(17.6674f, 6.478f, 17.478f, 6.6674f, 17.25f, 6.799f)
                curveTo(16.9019f, 7.0f, 16.4346f, 7.0f, 15.5f, 7.0f)
                horizontalLineTo(8.5f)
                curveTo(7.5654f, 7.0f, 7.0981f, 7.0f, 6.75f, 6.799f)
                curveTo(6.522f, 6.6674f, 6.3326f, 6.478f, 6.201f, 6.25f)
                curveTo(6.0f, 5.9019f, 6.0f, 5.4346f, 6.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(10.0f, 20.9428f, 10.0f, 21.4142f, 10.2929f, 21.7071f)
                curveTo(10.5858f, 22.0f, 11.0572f, 22.0f, 12.0f, 22.0f)
                curveTo(12.9428f, 22.0f, 13.4142f, 22.0f, 13.7071f, 21.7071f)
                curveTo(14.0f, 21.4142f, 14.0f, 20.9428f, 14.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(14.0f, 15.0572f, 14.0f, 14.5858f, 13.7071f, 14.2929f)
                curveTo(13.4142f, 14.0f, 12.9428f, 14.0f, 12.0f, 14.0f)
                curveTo(11.0572f, 14.0f, 10.5858f, 14.0f, 10.2929f, 14.2929f)
                curveTo(10.0f, 14.5858f, 10.0f, 15.0572f, 10.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0451f, 5.25f)
                curveTo(19.4997f, 5.25f, 19.8049f, 5.2504f, 20.0414f, 5.2658f)
                curveTo(20.2716f, 5.2808f, 20.3841f, 5.3078f, 20.4581f, 5.3369f)
                curveTo(20.7808f, 5.464f, 21.0362f, 5.7194f, 21.1633f, 6.0421f)
                curveTo(21.1924f, 6.1161f, 21.2194f, 6.2286f, 21.2344f, 6.4588f)
                curveTo(21.2498f, 6.6953f, 21.2502f, 7.0004f, 21.2502f, 7.4551f)
                curveTo(21.2502f, 8.2924f, 21.2396f, 8.5218f, 21.1788f, 8.6939f)
                curveTo(21.0745f, 8.9892f, 20.8632f, 9.2346f, 20.5867f, 9.3815f)
                curveTo(20.4256f, 9.4671f, 20.2002f, 9.5116f, 19.3722f, 9.6358f)
                lineTo(15.2488f, 10.2543f)
                curveTo(14.4761f, 10.3702f, 13.8275f, 10.4675f, 13.315f, 10.6116f)
                curveTo(12.772f, 10.7643f, 12.2915f, 10.9923f, 11.9164f, 11.4278f)
                curveTo(11.3356f, 12.1023f, 11.2719f, 12.9787f, 11.255f, 13.9875f)
                curveTo(11.2549f, 13.9945f, 11.2549f, 14.0015f, 11.2549f, 14.0085f)
                curveTo(11.4643f, 14.0f, 11.7098f, 14.0f, 12.0f, 14.0f)
                curveTo(12.2947f, 14.0f, 12.5433f, 14.0f, 12.7548f, 14.0089f)
                curveTo(12.7728f, 12.9462f, 12.8717f, 12.6172f, 13.053f, 12.4067f)
                curveTo(13.1625f, 12.2796f, 13.3305f, 12.1654f, 13.7211f, 12.0556f)
                curveTo(14.132f, 11.94f, 14.6863f, 11.8555f, 15.5181f, 11.7307f)
                lineTo(19.7139f, 11.1014f)
                curveTo(20.3646f, 11.0044f, 20.8715f, 10.9288f, 21.2905f, 10.7061f)
                curveTo(21.8989f, 10.3829f, 22.3638f, 9.843f, 22.5932f, 9.1935f)
                curveTo(22.7512f, 8.746f, 22.7508f, 8.2335f, 22.7503f, 7.5756f)
                lineTo(22.7502f, 7.431f)
                curveTo(22.7502f, 7.0066f, 22.7502f, 6.6523f, 22.7312f, 6.3612f)
                curveTo(22.7115f, 6.0582f, 22.6689f, 5.7717f, 22.559f, 5.4926f)
                curveTo(22.2795f, 4.7826f, 21.7176f, 4.2207f, 21.0076f, 3.9412f)
                curveTo(20.7285f, 3.8313f, 20.442f, 3.7887f, 20.139f, 3.769f)
                curveTo(19.8478f, 3.75f, 19.4936f, 3.75f, 19.0692f, 3.75f)
                horizontalLineTo(18.0002f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.0451f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.75f, 4.5f)
                curveTo(4.75f, 4.0858f, 5.0858f, 3.75f, 5.5f, 3.75f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.25f)
                horizontalLineTo(5.5f)
                curveTo(5.0858f, 5.25f, 4.75f, 4.9142f, 4.75f, 4.5f)
                close()
            }
        }
        .build()
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
