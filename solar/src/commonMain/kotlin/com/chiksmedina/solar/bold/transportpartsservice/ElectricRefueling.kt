package com.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

val TransportPartsServiceGroup.ElectricRefueling: ImageVector
    get() {
        if (_electricRefueling != null) {
            return _electricRefueling!!
        }
        _electricRefueling = Builder(
            name = "ElectricRefueling", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 2.0f, 4.7574f, 2.0f, 3.8787f, 2.8787f)
                curveTo(3.0f, 3.7574f, 3.0f, 5.1716f, 3.0f, 8.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 22.75f, 18.0f, 22.4142f, 18.0f, 22.0f)
                curveTo(18.0f, 21.5858f, 17.6642f, 21.25f, 17.25f, 21.25f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.75f)
                horizontalLineTo(17.5714f)
                curveTo(17.9462f, 17.75f, 18.25f, 18.0538f, 18.25f, 18.4286f)
                verticalLineTo(18.5f)
                curveTo(18.25f, 19.7427f, 19.2574f, 20.75f, 20.5f, 20.75f)
                curveTo(21.7426f, 20.75f, 22.75f, 19.7427f, 22.75f, 18.5f)
                verticalLineTo(7.6018f)
                curveTo(22.75f, 7.4451f, 22.75f, 7.337f, 22.7441f, 7.2316f)
                curveTo(22.6884f, 6.2406f, 22.2422f, 5.3121f, 21.5031f, 4.6496f)
                curveTo(21.4245f, 4.5792f, 21.3401f, 4.5116f, 21.2178f, 4.4138f)
                lineTo(19.9685f, 3.4144f)
                curveTo(19.6451f, 3.1556f, 19.1731f, 3.2081f, 18.9143f, 3.5315f)
                curveTo(18.6556f, 3.8549f, 18.708f, 4.3269f, 19.0315f, 4.5857f)
                lineTo(20.2646f, 5.5722f)
                curveTo(20.4091f, 5.6877f, 20.4585f, 5.7277f, 20.5019f, 5.7665f)
                curveTo(20.9453f, 6.1641f, 21.2131f, 6.7211f, 21.2465f, 7.3157f)
                curveTo(21.2497f, 7.3738f, 21.25f, 7.4374f, 21.25f, 7.6225f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.5f)
                curveTo(19.6716f, 8.0f, 19.0f, 8.6716f, 19.0f, 9.5f)
                verticalLineTo(11.9189f)
                curveTo(19.0f, 12.5645f, 19.4131f, 13.1377f, 20.0257f, 13.3419f)
                lineTo(21.25f, 13.75f)
                verticalLineTo(18.5f)
                curveTo(21.25f, 18.9142f, 20.9142f, 19.25f, 20.5f, 19.25f)
                curveTo(20.0858f, 19.25f, 19.75f, 18.9142f, 19.75f, 18.5f)
                verticalLineTo(18.4286f)
                curveTo(19.75f, 17.2254f, 18.7746f, 16.25f, 17.5714f, 16.25f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 5.1716f, 16.0f, 3.7574f, 15.1213f, 2.8787f)
                curveTo(14.2426f, 2.0f, 12.8284f, 2.0f, 10.0f, 2.0f)
                close()
                moveTo(9.8859f, 9.3569f)
                curveTo(10.2411f, 9.57f, 10.3562f, 10.0307f, 10.1431f, 10.3859f)
                lineTo(9.3246f, 11.75f)
                horizontalLineTo(11.0f)
                curveTo(11.2702f, 11.75f, 11.5195f, 11.8953f, 11.6527f, 12.1305f)
                curveTo(11.7858f, 12.3656f, 11.7821f, 12.6542f, 11.6431f, 12.8859f)
                lineTo(10.1431f, 15.3859f)
                curveTo(9.93f, 15.7411f, 9.4693f, 15.8562f, 9.1141f, 15.6431f)
                curveTo(8.7589f, 15.43f, 8.6438f, 14.9693f, 8.8569f, 14.6141f)
                lineTo(9.6754f, 13.25f)
                horizontalLineTo(8.0f)
                curveTo(7.7298f, 13.25f, 7.4805f, 13.1047f, 7.3474f, 12.8695f)
                curveTo(7.2142f, 12.6344f, 7.2179f, 12.3458f, 7.3569f, 12.1141f)
                lineTo(8.8569f, 9.6141f)
                curveTo(9.07f, 9.2589f, 9.5307f, 9.1438f, 9.8859f, 9.3569f)
                close()
            }
        }
            .build()
        return _electricRefueling!!
    }

private var _electricRefueling: ImageVector? = null
