package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.HeartPulse2: ImageVector
    get() {
        if (_heartPulse2 != null) {
            return _heartPulse2!!
        }
        _heartPulse2 = Builder(
            name = "HeartPulse2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.3459f, 11.2501f)
                curveTo(2.1246f, 10.5866f, 2.0f, 9.9202f, 2.0f, 9.2604f)
                curveTo(2.0f, 3.3495f, 7.5002f, 0.6626f, 12.0f, 5.4988f)
                curveTo(16.4998f, 0.6626f, 22.0f, 3.3493f, 22.0f, 9.2604f)
                curveTo(22.0f, 9.9202f, 21.8754f, 10.5866f, 21.6541f, 11.2501f)
                horizontalLineTo(18.6361f)
                lineTo(18.5241f, 11.25f)
                curveTo(17.9784f, 11.2491f, 17.4937f, 11.2483f, 17.0527f, 11.4447f)
                curveTo(16.6116f, 11.6411f, 16.2879f, 12.002f, 15.9233f, 12.4084f)
                lineTo(15.8485f, 12.4918f)
                lineTo(14.8192f, 13.6354f)
                curveTo(14.7426f, 13.7205f, 14.68f, 13.79f, 14.6247f, 13.8493f)
                curveTo(14.5723f, 13.7879f, 14.5128f, 13.7159f, 14.4401f, 13.6277f)
                lineTo(10.8889f, 9.3232f)
                curveTo(10.7493f, 9.1539f, 10.6f, 8.9728f, 10.454f, 8.8384f)
                curveTo(10.2839f, 8.6819f, 10.0325f, 8.5058f, 9.681f, 8.4847f)
                curveTo(9.3294f, 8.4636f, 9.0588f, 8.6083f, 8.8712f, 8.7433f)
                curveTo(8.7101f, 8.8593f, 8.5402f, 9.0212f, 8.3814f, 9.1726f)
                lineTo(6.8517f, 10.6294f)
                curveTo(6.38f, 11.0787f, 6.2815f, 11.1553f, 6.1785f, 11.1964f)
                curveTo(6.0756f, 11.2376f, 5.9515f, 11.2501f, 5.3f, 11.2501f)
                horizontalLineTo(2.3459f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0044f, 12.7501f)
                curveTo(4.3854f, 15.312f, 6.9303f, 17.7142f, 8.9617f, 19.3707f)
                curveTo(10.2937f, 20.4569f, 10.9597f, 21.0f, 12.0f, 21.0f)
                curveTo(13.0403f, 21.0f, 13.7063f, 20.4569f, 15.0383f, 19.3707f)
                curveTo(17.0697f, 17.7142f, 19.6146f, 15.312f, 20.9956f, 12.7501f)
                horizontalLineTo(18.6361f)
                curveTo(17.9119f, 12.7501f, 17.7746f, 12.7652f, 17.6629f, 12.815f)
                curveTo(17.5513f, 12.8647f, 17.4481f, 12.9567f, 16.9634f, 13.4952f)
                lineTo(15.9086f, 14.6672f)
                curveTo(15.7507f, 14.8428f, 15.5839f, 15.0283f, 15.4235f, 15.1628f)
                curveTo(15.2384f, 15.318f, 14.9627f, 15.4921f, 14.5896f, 15.4841f)
                curveTo(14.2166f, 15.476f, 13.9488f, 15.2904f, 13.7704f, 15.1274f)
                curveTo(13.616f, 14.9862f, 13.4574f, 14.7938f, 13.3074f, 14.6118f)
                lineTo(9.7549f, 10.3057f)
                curveTo(9.6873f, 10.2239f, 9.6324f, 10.1573f, 9.5839f, 10.1005f)
                curveTo(9.529f, 10.1511f, 9.4664f, 10.2106f, 9.3896f, 10.2838f)
                lineTo(7.8135f, 11.785f)
                curveTo(7.4575f, 12.125f, 7.1417f, 12.4267f, 6.7356f, 12.5892f)
                curveTo(6.3296f, 12.7516f, 5.8928f, 12.7509f, 5.4005f, 12.7502f)
                lineTo(3.0044f, 12.7501f)
                close()
            }
        }
            .build()
        return _heartPulse2!!
    }

private var _heartPulse2: ImageVector? = null
