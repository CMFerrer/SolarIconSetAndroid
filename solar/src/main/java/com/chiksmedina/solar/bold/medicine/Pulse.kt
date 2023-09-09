package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(15.0994f, 12.0935f)
                curveTo(14.9145f, 11.7916f, 14.7343f, 11.4972f, 14.558f, 11.2865f)
                curveTo(14.3708f, 11.0628f, 14.0427f, 10.7552f, 13.541f, 10.7753f)
                curveTo(13.0392f, 10.7954f, 12.7369f, 11.1284f, 12.5682f, 11.3663f)
                curveTo(12.4094f, 11.5905f, 12.2533f, 11.8984f, 12.0933f, 12.2141f)
                lineTo(10.1054f, 16.1339f)
                curveTo(10.0303f, 16.2819f, 9.9678f, 16.4051f, 9.9116f, 16.511f)
                curveTo(9.8432f, 16.4125f, 9.7665f, 16.2976f, 9.6744f, 16.1595f)
                lineTo(9.4976f, 15.8942f)
                curveTo(9.2942f, 15.5891f, 9.1141f, 15.3189f, 8.9414f, 15.1058f)
                curveTo(8.7541f, 14.8747f, 8.5432f, 14.6683f, 8.2589f, 14.5161f)
                curveTo(7.9746f, 14.364f, 7.6859f, 14.303f, 7.3897f, 14.2753f)
                curveTo(7.1166f, 14.2499f, 6.7919f, 14.2499f, 6.4253f, 14.2499f)
                lineTo(5.0f, 14.2499f)
                curveTo(4.5858f, 14.2499f, 4.25f, 14.5857f, 4.25f, 14.9999f)
                curveTo(4.25f, 15.4141f, 4.5858f, 15.7499f, 5.0f, 15.7499f)
                horizontalLineTo(6.3945f)
                curveTo(6.8011f, 15.7499f, 7.0553f, 15.7507f, 7.2505f, 15.7689f)
                curveTo(7.4302f, 15.7856f, 7.5038f, 15.8133f, 7.5511f, 15.8387f)
                curveTo(7.5985f, 15.864f, 7.6623f, 15.9099f, 7.776f, 16.0501f)
                curveTo(7.8994f, 16.2024f, 8.041f, 16.4135f, 8.2666f, 16.7518f)
                lineTo(8.4526f, 17.0309f)
                curveTo(8.6409f, 17.3135f, 8.8261f, 17.5915f, 9.0055f, 17.7898f)
                curveTo(9.1984f, 18.003f, 9.5282f, 18.2871f, 10.0153f, 18.2582f)
                curveTo(10.5025f, 18.2292f, 10.7963f, 17.9081f, 10.9626f, 17.6736f)
                curveTo(11.1173f, 17.4554f, 11.2683f, 17.1574f, 11.4218f, 16.8546f)
                lineTo(13.4092f, 12.9356f)
                curveTo(13.4876f, 12.7811f, 13.553f, 12.6522f, 13.6119f, 12.5414f)
                curveTo(13.6794f, 12.6472f, 13.7549f, 12.7704f, 13.8454f, 12.9181f)
                lineTo(14.4994f, 13.9859f)
                curveTo(14.6995f, 14.3127f, 14.8766f, 14.6018f, 15.0485f, 14.8299f)
                curveTo(15.2348f, 15.0772f, 15.4477f, 15.2988f, 15.7406f, 15.4629f)
                curveTo(16.0336f, 15.627f, 16.3337f, 15.6928f, 16.642f, 15.7225f)
                curveTo(16.9263f, 15.75f, 17.2653f, 15.7499f, 17.6485f, 15.7499f)
                lineTo(19.0f, 15.7499f)
                curveTo(19.4142f, 15.7499f, 19.75f, 15.4141f, 19.75f, 14.9999f)
                curveTo(19.75f, 14.5857f, 19.4142f, 14.2499f, 19.0f, 14.2499f)
                horizontalLineTo(17.6805f)
                curveTo(17.2557f, 14.2499f, 16.9897f, 14.2491f, 16.786f, 14.2295f)
                curveTo(16.5983f, 14.2114f, 16.5223f, 14.1815f, 16.4737f, 14.1542f)
                curveTo(16.4251f, 14.127f, 16.36f, 14.0779f, 16.2465f, 13.9272f)
                curveTo(16.1233f, 13.7638f, 15.9837f, 13.5374f, 15.7618f, 13.1751f)
                lineTo(15.0994f, 12.0935f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
