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

public val EssentionalUiGroup.CrownMinimalistic: ImageVector
    get() {
        if (_crownMinimalistic != null) {
            return _crownMinimalistic!!
        }
        _crownMinimalistic = Builder(name = "CrownMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8382f, 11.1263f)
                curveTo(22.0182f, 9.2137f, 22.1082f, 8.2574f, 21.781f, 7.8621f)
                curveTo(21.604f, 7.6482f, 21.3633f, 7.5172f, 21.106f, 7.4946f)
                curveTo(20.6303f, 7.4528f, 20.0329f, 8.1329f, 18.8381f, 9.4931f)
                curveTo(18.2202f, 10.1965f, 17.9113f, 10.5482f, 17.5666f, 10.6027f)
                curveTo(17.3757f, 10.6328f, 17.1811f, 10.6018f, 17.0047f, 10.5131f)
                curveTo(16.6865f, 10.3529f, 16.4743f, 9.9181f, 16.0499f, 9.0485f)
                lineTo(13.8131f, 4.4648f)
                curveTo(13.0112f, 2.8216f, 12.6102f, 2.0f, 12.0f, 2.0f)
                curveTo(11.3898f, 2.0f, 10.9888f, 2.8216f, 10.1869f, 4.4649f)
                lineTo(7.9501f, 9.0485f)
                curveTo(7.5257f, 9.9181f, 7.3135f, 10.3529f, 6.9953f, 10.5131f)
                curveTo(6.8189f, 10.6018f, 6.6243f, 10.6328f, 6.4334f, 10.6027f)
                curveTo(6.0887f, 10.5482f, 5.7798f, 10.1965f, 5.1619f, 9.4931f)
                curveTo(3.9671f, 8.1329f, 3.3697f, 7.4528f, 2.894f, 7.4946f)
                curveTo(2.6367f, 7.5172f, 2.396f, 7.6482f, 2.219f, 7.8621f)
                curveTo(1.8918f, 8.2574f, 1.9818f, 9.2137f, 2.1618f, 11.1263f)
                lineTo(2.391f, 13.5616f)
                curveTo(2.7687f, 17.5742f, 2.9575f, 19.5805f, 4.1401f, 20.7902f)
                curveTo(5.3227f, 22.0f, 7.0952f, 22.0f, 10.6401f, 22.0f)
                horizontalLineTo(13.3599f)
                curveTo(16.9048f, 22.0f, 18.6773f, 22.0f, 19.8599f, 20.7902f)
                curveTo(20.7738f, 19.8553f, 21.0942f, 18.4447f, 21.367f, 16.0f)
            }
        }
        .build()
        return _crownMinimalistic!!
    }

private var _crownMinimalistic: ImageVector? = null
