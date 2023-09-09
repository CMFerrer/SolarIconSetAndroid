package com.chiksmedina.solar.bold.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SettingsFineTuningGroup

public val SettingsFineTuningGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.2788f, 2.1522f)
                curveTo(13.9085f, 2.0f, 13.439f, 2.0f, 12.5f, 2.0f)
                curveTo(11.561f, 2.0f, 11.0915f, 2.0f, 10.7212f, 2.1522f)
                curveTo(10.2274f, 2.3552f, 9.8351f, 2.7446f, 9.6306f, 3.2346f)
                curveTo(9.5372f, 3.4583f, 9.5007f, 3.7185f, 9.4864f, 4.098f)
                curveTo(9.4653f, 4.6557f, 9.1772f, 5.1719f, 8.6902f, 5.4509f)
                curveTo(8.2032f, 5.73f, 7.6086f, 5.7195f, 7.1115f, 5.4588f)
                curveTo(6.7732f, 5.2813f, 6.5279f, 5.1826f, 6.286f, 5.151f)
                curveTo(5.7561f, 5.0818f, 5.2202f, 5.2243f, 4.7962f, 5.5472f)
                curveTo(4.4781f, 5.7894f, 4.2434f, 6.1929f, 3.7739f, 6.9999f)
                curveTo(3.3044f, 7.807f, 3.0697f, 8.2105f, 3.0173f, 8.6049f)
                curveTo(2.9476f, 9.1308f, 3.0912f, 9.6627f, 3.4165f, 10.0835f)
                curveTo(3.5651f, 10.2756f, 3.7738f, 10.437f, 4.0977f, 10.639f)
                curveTo(4.5739f, 10.936f, 4.8803f, 11.4419f, 4.8803f, 12.0f)
                curveTo(4.8803f, 12.5581f, 4.5739f, 13.0639f, 4.0977f, 13.3608f)
                curveTo(3.7737f, 13.5629f, 3.565f, 13.7244f, 3.4165f, 13.9165f)
                curveTo(3.0911f, 14.3373f, 2.9475f, 14.8691f, 3.0173f, 15.395f)
                curveTo(3.0696f, 15.7894f, 3.3043f, 16.193f, 3.7738f, 17.0f)
                curveTo(4.2433f, 17.807f, 4.478f, 18.2106f, 4.7961f, 18.4527f)
                curveTo(5.2201f, 18.7756f, 5.756f, 18.9181f, 6.2859f, 18.8489f)
                curveTo(6.5278f, 18.8173f, 6.773f, 18.7186f, 7.1113f, 18.5412f)
                curveTo(7.6085f, 18.2804f, 8.2031f, 18.27f, 8.6901f, 18.549f)
                curveTo(9.1771f, 18.8281f, 9.4653f, 19.3443f, 9.4864f, 19.9021f)
                curveTo(9.5007f, 20.2815f, 9.5372f, 20.5417f, 9.6306f, 20.7654f)
                curveTo(9.8351f, 21.2554f, 10.2274f, 21.6448f, 10.7212f, 21.8478f)
                curveTo(11.0915f, 22.0f, 11.561f, 22.0f, 12.5f, 22.0f)
                curveTo(13.439f, 22.0f, 13.9085f, 22.0f, 14.2788f, 21.8478f)
                curveTo(14.7726f, 21.6448f, 15.1649f, 21.2554f, 15.3694f, 20.7654f)
                curveTo(15.4628f, 20.5417f, 15.4994f, 20.2815f, 15.5137f, 19.902f)
                curveTo(15.5347f, 19.3443f, 15.8228f, 18.8281f, 16.3098f, 18.549f)
                curveTo(16.7968f, 18.2699f, 17.3914f, 18.2804f, 17.8886f, 18.5412f)
                curveTo(18.2269f, 18.7186f, 18.4721f, 18.8172f, 18.714f, 18.8488f)
                curveTo(19.2439f, 18.9181f, 19.7798f, 18.7756f, 20.2038f, 18.4527f)
                curveTo(20.5219f, 18.2105f, 20.7566f, 17.807f, 21.2261f, 16.9999f)
                curveTo(21.6956f, 16.1929f, 21.9303f, 15.7894f, 21.9827f, 15.395f)
                curveTo(22.0524f, 14.8691f, 21.9088f, 14.3372f, 21.5835f, 13.9164f)
                curveTo(21.4349f, 13.7243f, 21.2262f, 13.5628f, 20.9022f, 13.3608f)
                curveTo(20.4261f, 13.0639f, 20.1197f, 12.558f, 20.1197f, 11.9999f)
                curveTo(20.1197f, 11.4418f, 20.4261f, 10.9361f, 20.9022f, 10.6392f)
                curveTo(21.2263f, 10.4371f, 21.435f, 10.2757f, 21.5836f, 10.0835f)
                curveTo(21.9089f, 9.6627f, 22.0525f, 9.1309f, 21.9828f, 8.605f)
                curveTo(21.9304f, 8.2106f, 21.6957f, 7.807f, 21.2262f, 7.0f)
                curveTo(20.7567f, 6.193f, 20.522f, 5.7895f, 20.2039f, 5.5473f)
                curveTo(19.7799f, 5.2244f, 19.244f, 5.0819f, 18.7141f, 5.1511f)
                curveTo(18.4722f, 5.1827f, 18.2269f, 5.2814f, 17.8887f, 5.4588f)
                curveTo(17.3915f, 5.7196f, 16.7969f, 5.73f, 16.3099f, 5.451f)
                curveTo(15.8229f, 5.1719f, 15.5347f, 4.6557f, 15.5136f, 4.0979f)
                curveTo(15.4993f, 3.7185f, 15.4628f, 3.4583f, 15.3694f, 3.2346f)
                curveTo(15.1649f, 2.7446f, 14.7726f, 2.3552f, 14.2788f, 2.1522f)
                close()
                moveTo(12.5f, 15.0f)
                curveTo(14.1695f, 15.0f, 15.5228f, 13.6569f, 15.5228f, 12.0f)
                curveTo(15.5228f, 10.3431f, 14.1695f, 9.0f, 12.5f, 9.0f)
                curveTo(10.8305f, 9.0f, 9.4772f, 10.3431f, 9.4772f, 12.0f)
                curveTo(9.4772f, 13.6569f, 10.8305f, 15.0f, 12.5f, 15.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
