package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.CrownLine: ImageVector
    get() {
        if (_crownLine != null) {
            return _crownLine!!
        }
        _crownLine = Builder(
            name = "CrownLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.8382f, 11.1263f)
                lineTo(21.609f, 13.5616f)
                curveTo(21.2313f, 17.5742f, 21.0425f, 19.5805f, 19.8599f, 20.7902f)
                curveTo(18.6773f, 22.0f, 16.9048f, 22.0f, 13.3599f, 22.0f)
                horizontalLineTo(10.6401f)
                curveTo(7.0952f, 22.0f, 5.3227f, 22.0f, 4.1401f, 20.7902f)
                curveTo(2.9575f, 19.5805f, 2.7687f, 17.5742f, 2.391f, 13.5616f)
                lineTo(2.1618f, 11.1263f)
                curveTo(1.9818f, 9.2137f, 1.8918f, 8.2574f, 2.219f, 7.8621f)
                curveTo(2.396f, 7.6482f, 2.6367f, 7.5172f, 2.894f, 7.4946f)
                curveTo(3.3697f, 7.4528f, 3.9671f, 8.1329f, 5.1619f, 9.4931f)
                curveTo(5.7798f, 10.1965f, 6.0887f, 10.5482f, 6.4334f, 10.6027f)
                curveTo(6.6243f, 10.6328f, 6.8189f, 10.6018f, 6.9953f, 10.5131f)
                curveTo(7.3135f, 10.3529f, 7.5257f, 9.9181f, 7.9501f, 9.0485f)
                lineTo(10.1869f, 4.4649f)
                curveTo(10.9888f, 2.8216f, 11.3898f, 2.0f, 12.0f, 2.0f)
                curveTo(12.6102f, 2.0f, 13.0112f, 2.8216f, 13.8131f, 4.4648f)
                lineTo(16.0499f, 9.0485f)
                curveTo(16.4743f, 9.9181f, 16.6865f, 10.3529f, 17.0047f, 10.5131f)
                curveTo(17.1811f, 10.6018f, 17.3757f, 10.6328f, 17.5666f, 10.6027f)
                curveTo(17.9113f, 10.5482f, 18.2202f, 10.1965f, 18.8381f, 9.4931f)
                curveTo(20.0329f, 8.1329f, 20.6303f, 7.4528f, 21.106f, 7.4946f)
                curveTo(21.3633f, 7.5172f, 21.604f, 7.6482f, 21.781f, 7.8621f)
                curveTo(22.1082f, 8.2574f, 22.0182f, 9.2137f, 21.8382f, 11.1263f)
                close()
                moveTo(8.25f, 18.0f)
                curveTo(8.25f, 17.5858f, 8.5858f, 17.25f, 9.0f, 17.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 17.25f, 15.75f, 17.5858f, 15.75f, 18.0f)
                curveTo(15.75f, 18.4142f, 15.4142f, 18.75f, 15.0f, 18.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 18.75f, 8.25f, 18.4142f, 8.25f, 18.0f)
                close()
            }
        }
            .build()
        return _crownLine!!
    }

private var _crownLine: ImageVector? = null
