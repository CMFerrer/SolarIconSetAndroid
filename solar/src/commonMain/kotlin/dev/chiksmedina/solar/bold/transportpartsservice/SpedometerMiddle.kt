package dev.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TransportPartsServiceGroup

val TransportPartsServiceGroup.SpedometerMiddle: ImageVector
    get() {
        if (_spedometerMiddle != null) {
            return _spedometerMiddle!!
        }
        _spedometerMiddle = Builder(
            name = "SpedometerMiddle", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.7521f, 3.9753f)
                curveTo(12.7521f, 4.39f, 12.4154f, 4.7263f, 12.0f, 4.7263f)
                curveTo(11.5846f, 4.7263f, 11.2479f, 4.39f, 11.2479f, 3.9753f)
                verticalLineTo(2.0f)
                curveTo(9.0443f, 2.1632f, 7.0388f, 3.0375f, 5.4609f, 4.394f)
                lineTo(7.0165f, 5.9474f)
                curveTo(7.3102f, 6.2407f, 7.3102f, 6.7163f, 7.0165f, 7.0096f)
                curveTo(6.7228f, 7.3029f, 6.2466f, 7.3029f, 5.9529f, 7.0096f)
                lineTo(4.3973f, 5.4561f)
                curveTo(3.0389f, 7.0318f, 2.1634f, 9.0345f, 2.0f, 11.2351f)
                horizontalLineTo(3.9778f)
                curveTo(4.3931f, 11.2351f, 4.7299f, 11.5713f, 4.7299f, 11.9861f)
                curveTo(4.7299f, 12.4009f, 4.3931f, 12.7372f, 3.9778f, 12.7372f)
                horizontalLineTo(2.0f)
                curveTo(2.1634f, 14.9378f, 3.0389f, 16.9404f, 4.3973f, 18.5161f)
                lineTo(5.9529f, 16.9627f)
                curveTo(6.2466f, 16.6694f, 6.7228f, 16.6694f, 7.0165f, 16.9627f)
                curveTo(7.3102f, 17.256f, 7.3102f, 17.7315f, 7.0165f, 18.0248f)
                lineTo(5.4609f, 19.5783f)
                curveTo(7.2166f, 21.0876f, 9.5016f, 22.0f, 12.0f, 22.0f)
                curveTo(14.4984f, 22.0f, 16.7834f, 21.0876f, 18.5391f, 19.5783f)
                lineTo(16.9835f, 18.0248f)
                curveTo(16.6898f, 17.7315f, 16.6898f, 17.256f, 16.9835f, 16.9627f)
                curveTo(17.2772f, 16.6694f, 17.7534f, 16.6694f, 18.0471f, 16.9627f)
                lineTo(19.6027f, 18.5161f)
                curveTo(20.9611f, 16.9404f, 21.8366f, 14.9378f, 22.0f, 12.7372f)
                horizontalLineTo(20.022f)
                curveTo(19.6066f, 12.7372f, 19.2699f, 12.4009f, 19.2699f, 11.9861f)
                curveTo(19.2699f, 11.5713f, 19.6066f, 11.2351f, 20.022f, 11.2351f)
                horizontalLineTo(22.0f)
                curveTo(21.8366f, 9.0345f, 20.9611f, 7.0318f, 19.6027f, 5.4561f)
                lineTo(18.0471f, 7.0096f)
                curveTo(17.7534f, 7.3029f, 17.2772f, 7.3029f, 16.9835f, 7.0096f)
                curveTo(16.6898f, 6.7163f, 16.6898f, 6.2407f, 16.9835f, 5.9474f)
                lineTo(18.5391f, 4.394f)
                curveTo(16.9612f, 3.0375f, 14.9557f, 2.1632f, 12.7521f, 2.0f)
                verticalLineTo(3.9753f)
                close()
                moveTo(12.0278f, 16.0194f)
                curveTo(10.3663f, 16.0194f, 9.0195f, 14.6744f, 9.0195f, 13.0153f)
                curveTo(9.0195f, 12.3841f, 9.4547f, 11.5087f, 9.9942f, 10.6661f)
                curveTo(10.8008f, 9.4061f, 11.2041f, 8.7761f, 12.0278f, 8.7761f)
                curveTo(12.8514f, 8.7761f, 13.2548f, 9.4061f, 14.0614f, 10.6661f)
                curveTo(14.6008f, 11.5087f, 15.0361f, 12.3841f, 15.0361f, 13.0153f)
                curveTo(15.0361f, 14.6744f, 13.6892f, 16.0194f, 12.0278f, 16.0194f)
                close()
            }
        }
            .build()
        return _spedometerMiddle!!
    }

private var _spedometerMiddle: ImageVector? = null
