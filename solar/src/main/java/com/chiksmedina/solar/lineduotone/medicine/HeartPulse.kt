package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

public val MedicineGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                horizontalLineTo(17.1986f)
                curveTo(16.3689f, 12.0f, 15.9541f, 12.0f, 15.6102f, 12.1947f)
                curveTo(15.2664f, 12.3894f, 15.0529f, 12.7451f, 14.6261f, 13.4565f)
                lineTo(14.5952f, 13.508f)
                curveTo(14.1976f, 14.1707f, 13.9987f, 14.5021f, 13.7095f, 14.4967f)
                curveTo(13.4202f, 14.4912f, 13.2339f, 14.1526f, 12.8615f, 13.4754f)
                lineTo(11.1742f, 10.4076f)
                curveTo(10.8269f, 9.7762f, 10.6533f, 9.4605f, 10.3759f, 9.4455f)
                curveTo(10.0986f, 9.4305f, 9.892f, 9.7257f, 9.4788f, 10.3161f)
                lineTo(9.1957f, 10.7204f)
                curveTo(8.7568f, 11.3474f, 8.5373f, 11.6609f, 8.2117f, 11.8305f)
                curveTo(7.8861f, 12.0f, 7.5034f, 12.0f, 6.738f, 12.0f)
                horizontalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9617f, 19.3707f)
                lineTo(9.4357f, 18.7895f)
                lineTo(9.4357f, 18.7895f)
                lineTo(8.9617f, 19.3707f)
                close()
                moveTo(12.0f, 5.4988f)
                lineTo(11.4509f, 6.0097f)
                curveTo(11.5928f, 6.1621f, 11.7917f, 6.2488f, 12.0f, 6.2488f)
                curveTo(12.2083f, 6.2488f, 12.4072f, 6.1621f, 12.5491f, 6.0097f)
                lineTo(12.0f, 5.4988f)
                close()
                moveTo(15.0383f, 19.3707f)
                lineTo(15.5123f, 19.952f)
                lineTo(15.5123f, 19.952f)
                lineTo(15.0383f, 19.3707f)
                close()
                moveTo(9.4357f, 18.7895f)
                curveTo(7.9858f, 17.6072f, 6.2929f, 16.0568f, 4.9688f, 14.3598f)
                curveTo(3.6305f, 12.6445f, 2.75f, 10.8821f, 2.75f, 9.2604f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 11.3862f, 2.3793f, 13.4793f, 3.7862f, 15.2825f)
                curveTo(5.2074f, 17.1039f, 6.9953f, 18.7349f, 8.4878f, 19.952f)
                lineTo(9.4357f, 18.7895f)
                close()
                moveTo(2.75f, 9.2604f)
                curveTo(2.75f, 6.5306f, 4.0079f, 4.7045f, 5.6006f, 4.0419f)
                curveTo(7.173f, 3.3878f, 9.3528f, 3.7548f, 11.4509f, 6.0097f)
                lineTo(12.5491f, 4.9879f)
                curveTo(10.1473f, 2.4066f, 7.3272f, 1.699f, 5.0245f, 2.657f)
                curveTo(2.7422f, 3.6065f, 1.25f, 6.0794f, 1.25f, 9.2604f)
                horizontalLineTo(2.75f)
                close()
                moveTo(15.5123f, 19.952f)
                curveTo(17.0047f, 18.735f, 18.7926f, 17.1039f, 20.2138f, 15.2825f)
                curveTo(21.6207f, 13.4794f, 22.75f, 11.3862f, 22.75f, 9.2604f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 10.8821f, 20.3695f, 12.6445f, 19.0312f, 14.3598f)
                curveTo(17.7071f, 16.0568f, 16.0142f, 17.6072f, 14.5643f, 18.7895f)
                lineTo(15.5123f, 19.952f)
                close()
                moveTo(22.75f, 9.2604f)
                curveTo(22.75f, 6.0793f, 21.2578f, 3.6064f, 18.9755f, 2.6569f)
                curveTo(16.6728f, 1.6989f, 13.8527f, 2.4066f, 11.4509f, 4.9879f)
                lineTo(12.5491f, 6.0097f)
                curveTo(14.6472f, 3.7548f, 16.827f, 3.3877f, 18.3994f, 4.0418f)
                curveTo(19.9921f, 4.7044f, 21.25f, 6.5304f, 21.25f, 9.2604f)
                horizontalLineTo(22.75f)
                close()
                moveTo(8.4878f, 19.952f)
                curveTo(9.7587f, 20.9884f, 10.641f, 21.75f, 12.0f, 21.75f)
                lineTo(12.0f, 20.25f)
                curveTo(11.2785f, 20.25f, 10.8287f, 19.9254f, 9.4357f, 18.7895f)
                lineTo(8.4878f, 19.952f)
                close()
                moveTo(14.5643f, 18.7895f)
                curveTo(13.1713f, 19.9254f, 12.7216f, 20.25f, 12.0f, 20.25f)
                lineTo(12.0f, 21.75f)
                curveTo(13.359f, 21.75f, 14.2413f, 20.9884f, 15.5123f, 19.952f)
                lineTo(14.5643f, 18.7895f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
