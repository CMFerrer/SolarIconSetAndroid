package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.Radar2: ImageVector
    get() {
        if (_radar2 != null) {
            return _radar2!!
        }
        _radar2 = Builder(name = "Radar2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.3941f, 3.0648f)
                curveTo(11.9587f, 2.4122f, 9.4913f, 2.7944f, 7.4554f, 3.943f)
                curveTo(7.0946f, 4.1465f, 6.6372f, 4.0191f, 6.4336f, 3.6583f)
                curveTo(6.2301f, 3.2975f, 6.3576f, 2.8401f, 6.7183f, 2.6365f)
                curveTo(9.0823f, 1.3028f, 11.9525f, 0.8576f, 14.7823f, 1.6159f)
                curveTo(20.5171f, 3.1525f, 23.9203f, 9.0471f, 22.3837f, 14.7819f)
                curveTo(20.8471f, 20.5167f, 14.9525f, 23.9199f, 9.2177f, 22.3833f)
                curveTo(3.4829f, 20.8467f, 0.0797f, 14.952f, 1.6163f, 9.2173f)
                curveTo(1.9206f, 8.0818f, 2.3963f, 7.0363f, 3.0087f, 6.1023f)
                curveTo(3.5828f, 5.2268f, 4.7405f, 5.159f, 5.4738f, 5.7525f)
                lineTo(12.4718f, 11.4166f)
                curveTo(12.7938f, 11.6772f, 12.8436f, 12.1495f, 12.583f, 12.4714f)
                curveTo(12.3224f, 12.7934f, 11.8501f, 12.8432f, 11.5281f, 12.5826f)
                lineTo(7.4884f, 9.3129f)
                curveTo(7.0193f, 10.0988f, 6.75f, 11.0171f, 6.75f, 11.9996f)
                curveTo(6.75f, 14.8991f, 9.1005f, 17.2496f, 12.0f, 17.2496f)
                curveTo(14.8995f, 17.2496f, 17.25f, 14.8991f, 17.25f, 11.9996f)
                curveTo(17.25f, 9.1001f, 14.8995f, 6.7496f, 12.0f, 6.7496f)
                curveTo(11.4185f, 6.7496f, 10.8606f, 6.8438f, 10.3398f, 7.0173f)
                curveTo(9.9468f, 7.1482f, 9.5221f, 6.9357f, 9.3912f, 6.5427f)
                curveTo(9.2604f, 6.1497f, 9.4728f, 5.725f, 9.8658f, 5.5941f)
                curveTo(10.5376f, 5.3704f, 11.2554f, 5.2496f, 12.0f, 5.2496f)
                curveTo(15.7279f, 5.2496f, 18.75f, 8.2717f, 18.75f, 11.9996f)
                curveTo(18.75f, 15.7275f, 15.7279f, 18.7496f, 12.0f, 18.7496f)
                curveTo(8.2721f, 18.7496f, 5.25f, 15.7275f, 5.25f, 11.9996f)
                curveTo(5.25f, 10.6607f, 5.6405f, 9.4117f, 6.3133f, 8.3618f)
                lineTo(4.5301f, 6.9185f)
                curveTo(4.4742f, 6.8733f, 4.4114f, 6.8597f, 4.3615f, 6.8657f)
                curveTo(4.3161f, 6.8712f, 4.2853f, 6.8909f, 4.2632f, 6.9248f)
                curveTo(3.7371f, 7.727f, 3.3276f, 8.6261f, 3.0652f, 9.6055f)
                curveTo(1.743f, 14.5401f, 4.6714f, 19.6122f, 9.6059f, 20.9344f)
                curveTo(14.5405f, 22.2566f, 19.6126f, 19.3282f, 20.9348f, 14.3937f)
                curveTo(22.257f, 9.4591f, 19.3286f, 4.387f, 14.3941f, 3.0648f)
                close()
            }
        }
        .build()
        return _radar2!!
    }

private var _radar2: ImageVector? = null
