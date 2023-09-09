package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.ColourTuneing: ImageVector
    get() {
        if (_colourTuneing != null) {
            return _colourTuneing!!
        }
        _colourTuneing = Builder(name = "ColourTuneing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.116f, 4.333f)
                curveTo(5.4077f, 5.3862f, 4.8941f, 6.8213f, 4.8941f, 8.3158f)
                curveTo(4.8941f, 8.73f, 4.5583f, 9.0658f, 4.1441f, 9.0658f)
                curveTo(3.7298f, 9.0658f, 3.394f, 8.73f, 3.394f, 8.3158f)
                curveTo(3.394f, 6.4945f, 4.0133f, 4.7717f, 4.8714f, 3.4959f)
                curveTo(5.3012f, 2.8568f, 5.8047f, 2.3093f, 6.3452f, 1.9148f)
                curveTo(6.8791f, 1.5251f, 7.4985f, 1.25f, 8.144f, 1.25f)
                curveTo(9.7092f, 1.25f, 10.894f, 2.3626f, 11.6493f, 4.1411f)
                curveTo(12.4046f, 5.9199f, 12.8223f, 8.5358f, 12.8223f, 12.0002f)
                curveTo(12.8223f, 15.3779f, 13.2343f, 17.7621f, 13.8758f, 19.2728f)
                curveTo(14.5174f, 20.7838f, 15.2967f, 21.2502f, 16.0002f, 21.2502f)
                curveTo(16.2218f, 21.2502f, 16.536f, 21.1502f, 16.9147f, 20.8738f)
                curveTo(17.2868f, 20.6022f, 17.6749f, 20.1925f, 18.0283f, 19.6671f)
                curveTo(18.7366f, 18.6139f, 19.2502f, 17.1788f, 19.2502f, 15.6844f)
                curveTo(19.2502f, 15.2702f, 19.586f, 14.9344f, 20.0002f, 14.9344f)
                curveTo(20.4145f, 14.9344f, 20.7502f, 15.2702f, 20.7502f, 15.6844f)
                curveTo(20.7502f, 17.5057f, 20.131f, 19.2285f, 19.2729f, 20.5043f)
                curveTo(18.8431f, 21.1433f, 18.3395f, 21.6909f, 17.7991f, 22.0854f)
                curveTo(17.2651f, 22.4751f, 16.6458f, 22.7502f, 16.0002f, 22.7502f)
                curveTo(14.4351f, 22.7502f, 13.2503f, 21.6376f, 12.4951f, 19.8591f)
                curveTo(11.7398f, 18.0804f, 11.3223f, 15.4645f, 11.3223f, 12.0002f)
                curveTo(11.3223f, 8.6224f, 10.9102f, 6.2382f, 10.2686f, 4.7274f)
                curveTo(9.6269f, 3.2164f, 8.8476f, 2.75f, 8.144f, 2.75f)
                curveTo(7.9225f, 2.75f, 7.6083f, 2.8499f, 7.2296f, 3.1263f)
                curveTo(6.8575f, 3.3979f, 6.4694f, 3.8077f, 6.116f, 4.333f)
                close()
                moveTo(1.25f, 12.0002f)
                curveTo(1.25f, 11.586f, 1.5858f, 11.2502f, 2.0f, 11.2502f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 11.2502f, 10.25f, 11.586f, 10.25f, 12.0002f)
                curveTo(10.25f, 12.4144f, 9.9142f, 12.7502f, 9.5f, 12.7502f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.7502f, 1.25f, 12.4144f, 1.25f, 12.0002f)
                close()
                moveTo(13.75f, 12.0002f)
                curveTo(13.75f, 11.586f, 14.0858f, 11.2502f, 14.5f, 11.2502f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.2502f, 22.75f, 11.586f, 22.75f, 12.0002f)
                curveTo(22.75f, 12.4144f, 22.4142f, 12.7502f, 22.0f, 12.7502f)
                horizontalLineTo(14.5f)
                curveTo(14.0858f, 12.7502f, 13.75f, 12.4144f, 13.75f, 12.0002f)
                close()
            }
        }
        .build()
        return _colourTuneing!!
    }

private var _colourTuneing: ImageVector? = null
