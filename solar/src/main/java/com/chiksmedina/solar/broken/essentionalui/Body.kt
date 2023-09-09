package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.Body: ImageVector
    get() {
        if (_body != null) {
            return _body!!
        }
        _body = Builder(name = "Body", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8928f, 14.0f)
                verticalLineTo(15.5403f)
                curveTo(17.8928f, 16.2412f, 17.8928f, 16.5917f, 17.772f, 16.9159f)
                curveTo(17.6512f, 17.2402f, 17.4187f, 17.5138f, 16.9537f, 18.0611f)
                lineTo(14.5722f, 20.8641f)
                curveTo(14.098f, 21.4222f, 13.8609f, 21.7013f, 13.5309f, 21.8506f)
                curveTo(13.2009f, 22.0f, 12.8213f, 22.0f, 12.0623f, 22.0f)
                horizontalLineTo(11.9377f)
                curveTo(11.1787f, 22.0f, 10.7991f, 22.0f, 10.4691f, 21.8506f)
                curveTo(10.1391f, 21.7013f, 9.902f, 21.4222f, 9.4278f, 20.8641f)
                lineTo(7.0463f, 18.0611f)
                curveTo(6.5813f, 17.5138f, 6.3488f, 17.2402f, 6.228f, 16.9159f)
                curveTo(6.1072f, 16.5917f, 6.1072f, 16.2412f, 6.1072f, 15.5403f)
                verticalLineTo(10.2771f)
                curveTo(6.1072f, 9.5922f, 6.1072f, 9.2498f, 5.9602f, 8.9488f)
                curveTo(5.8132f, 8.6478f, 5.537f, 8.4249f, 4.9848f, 7.9792f)
                lineTo(4.7774f, 7.8119f)
                curveTo(3.5955f, 6.8579f, 3.0045f, 6.3809f, 3.0f, 5.6905f)
                curveTo(2.9956f, 5.0f, 3.5198f, 4.5665f, 4.5681f, 3.6994f)
                curveTo(4.7268f, 3.5682f, 4.884f, 3.4454f, 5.0358f, 3.3365f)
                curveTo(5.6085f, 2.9256f, 6.4383f, 2.4726f, 7.0221f, 2.1703f)
                curveTo(7.4545f, 1.9464f, 7.9747f, 1.9458f, 8.416f, 2.1536f)
                lineTo(8.68f, 2.2778f)
                curveTo(8.7493f, 2.3105f, 8.8084f, 2.3596f, 8.8513f, 2.4203f)
                curveTo(10.3492f, 4.5359f, 13.6508f, 4.5359f, 15.1487f, 2.4203f)
                curveTo(15.1916f, 2.3596f, 15.2507f, 2.3105f, 15.32f, 2.2778f)
                lineTo(15.584f, 2.1536f)
                curveTo(16.0253f, 1.9458f, 16.5455f, 1.9464f, 16.9779f, 2.1703f)
                curveTo(17.5617f, 2.4726f, 18.3915f, 2.9256f, 18.9642f, 3.3365f)
                curveTo(19.116f, 3.4454f, 19.2732f, 3.5682f, 19.4319f, 3.6994f)
                curveTo(20.4802f, 4.5665f, 21.0044f, 5.0f, 21.0f, 5.6905f)
                curveTo(20.9955f, 6.3809f, 20.4045f, 6.8579f, 19.2226f, 7.8119f)
                lineTo(19.0152f, 7.9792f)
                curveTo(18.463f, 8.4249f, 18.1868f, 8.6478f, 18.0398f, 8.9488f)
                curveTo(17.9141f, 9.2062f, 17.8959f, 9.4938f, 17.8932f, 10.0f)
            }
        }
        .build()
        return _body!!
    }

private var _body: ImageVector? = null
