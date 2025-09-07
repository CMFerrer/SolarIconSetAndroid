package com.chiksmedina.solar.broken.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SettingsFineTuningGroup

val SettingsFineTuningGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(
            name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.6612f, 10.6392f)
                curveTo(4.1338f, 10.9361f, 4.4378f, 11.4419f, 4.4378f, 11.9999f)
                curveTo(4.4378f, 12.558f, 4.1338f, 13.0638f, 3.6612f, 13.3607f)
                curveTo(3.3397f, 13.5627f, 3.1325f, 13.7242f, 2.9851f, 13.9163f)
                curveTo(2.6622f, 14.3372f, 2.5197f, 14.869f, 2.5889f, 15.3949f)
                curveTo(2.6408f, 15.7893f, 2.8738f, 16.1928f, 3.3397f, 16.9999f)
                curveTo(3.8057f, 17.8069f, 4.0387f, 18.2104f, 4.3543f, 18.4526f)
                curveTo(4.7751f, 18.7755f, 5.3069f, 18.918f, 5.8328f, 18.8488f)
                curveTo(6.0729f, 18.8172f, 6.3163f, 18.7185f, 6.652f, 18.5411f)
                curveTo(7.1454f, 18.2803f, 7.7356f, 18.2699f, 8.219f, 18.549f)
                curveTo(8.7023f, 18.8281f, 8.9883f, 19.3443f, 9.0091f, 19.902f)
                curveTo(9.0233f, 20.2815f, 9.0596f, 20.5417f, 9.1522f, 20.7654f)
                curveTo(9.3552f, 21.2554f, 9.7446f, 21.6448f, 10.2346f, 21.8478f)
                curveTo(10.6022f, 22.0f, 11.0681f, 22.0f, 12.0f, 22.0f)
                curveTo(12.9319f, 22.0f, 13.3978f, 22.0f, 13.7654f, 21.8478f)
                curveTo(14.2554f, 21.6448f, 14.6448f, 21.2554f, 14.8478f, 20.7654f)
                curveTo(14.9404f, 20.5417f, 14.9767f, 20.2815f, 14.9909f, 19.9021f)
                curveTo(15.0117f, 19.3443f, 15.2977f, 18.8281f, 15.7811f, 18.549f)
                curveTo(16.2644f, 18.27f, 16.8545f, 18.2804f, 17.3479f, 18.5412f)
                curveTo(17.6837f, 18.7186f, 17.9271f, 18.8173f, 18.1671f, 18.8489f)
                curveTo(18.693f, 18.9182f, 19.2249f, 18.7756f, 19.6457f, 18.4527f)
                curveTo(19.9613f, 18.2106f, 20.1943f, 17.807f, 20.6603f, 17.0f)
                curveTo(20.8677f, 16.6407f, 21.029f, 16.3614f, 21.1486f, 16.1272f)
                moveTo(20.3387f, 13.3608f)
                curveTo(19.8662f, 13.0639f, 19.5622f, 12.5581f, 19.5621f, 12.0001f)
                curveTo(19.5621f, 11.442f, 19.8662f, 10.9361f, 20.3387f, 10.6392f)
                curveTo(20.6603f, 10.4372f, 20.8674f, 10.2757f, 21.0148f, 10.0836f)
                curveTo(21.3377f, 9.6628f, 21.4802f, 9.1309f, 21.411f, 8.605f)
                curveTo(21.3591f, 8.2106f, 21.1261f, 7.8071f, 20.6601f, 7.0001f)
                curveTo(20.1942f, 6.193f, 19.9612f, 5.7895f, 19.6456f, 5.5473f)
                curveTo(19.2248f, 5.2244f, 18.6929f, 5.0819f, 18.167f, 5.1511f)
                curveTo(17.927f, 5.1827f, 17.6836f, 5.2814f, 17.3479f, 5.4588f)
                curveTo(16.8544f, 5.7196f, 16.2643f, 5.73f, 15.781f, 5.451f)
                curveTo(15.2977f, 5.1719f, 15.0117f, 4.6557f, 14.9909f, 4.098f)
                curveTo(14.9767f, 3.7185f, 14.9404f, 3.4583f, 14.8478f, 3.2346f)
                curveTo(14.6448f, 2.7446f, 14.2554f, 2.3552f, 13.7654f, 2.1522f)
                curveTo(13.3978f, 2.0f, 12.9319f, 2.0f, 12.0f, 2.0f)
                curveTo(11.0681f, 2.0f, 10.6022f, 2.0f, 10.2346f, 2.1522f)
                curveTo(9.7446f, 2.3552f, 9.3552f, 2.7446f, 9.1522f, 3.2346f)
                curveTo(9.0596f, 3.4583f, 9.0233f, 3.7185f, 9.0091f, 4.0979f)
                curveTo(8.9883f, 4.6557f, 8.7022f, 5.1719f, 8.2189f, 5.451f)
                curveTo(7.7356f, 5.73f, 7.1455f, 5.7196f, 6.6521f, 5.4588f)
                curveTo(6.3163f, 5.2814f, 6.0729f, 5.1827f, 5.8328f, 5.1511f)
                curveTo(5.307f, 5.0819f, 4.7751f, 5.2244f, 4.3543f, 5.5473f)
                curveTo(4.0387f, 5.7895f, 3.8057f, 6.193f, 3.3397f, 7.0f)
                curveTo(3.1323f, 7.3593f, 2.9711f, 7.6386f, 2.8514f, 7.8727f)
            }
        }
            .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
