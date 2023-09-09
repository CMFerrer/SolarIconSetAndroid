package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(9.4495f, 22.75f, 7.1064f, 21.8618f, 5.2633f, 20.3778f)
                curveTo(5.2624f, 20.377f, 5.2615f, 20.3763f, 5.2606f, 20.3756f)
                curveTo(2.8148f, 18.4051f, 1.25f, 15.3853f, 1.25f, 12.0f)
                close()
                moveTo(8.042f, 20.3628f)
                curveTo(9.2419f, 20.9317f, 10.5838f, 21.25f, 12.0f, 21.25f)
                curveTo(15.315f, 21.25f, 18.2226f, 19.5062f, 19.8558f, 16.8859f)
                curveTo(19.3678f, 16.16f, 18.7873f, 15.5156f, 18.1356f, 14.9642f)
                curveTo(15.5297f, 17.766f, 11.8666f, 19.7717f, 8.042f, 20.3628f)
                close()
                moveTo(16.9049f, 14.0831f)
                curveTo(14.0996f, 17.0241f, 10.0216f, 18.9577f, 5.9997f, 19.0401f)
                curveTo(5.3761f, 18.5081f, 4.8241f, 17.8947f, 4.36f, 17.2163f)
                curveTo(7.4223f, 16.9758f, 10.2597f, 15.4591f, 12.1617f, 13.0137f)
                lineTo(12.3637f, 12.7539f)
                curveTo(13.9877f, 12.8011f, 15.5476f, 13.2689f, 16.9049f, 14.0831f)
                close()
                moveTo(12.4304f, 11.2553f)
                curveTo(15.6411f, 11.3552f, 18.6342f, 12.8723f, 20.613f, 15.3801f)
                curveTo(21.0242f, 14.3331f, 21.25f, 13.1929f, 21.25f, 12.0f)
                curveTo(21.25f, 11.9391f, 21.2494f, 11.8784f, 21.2482f, 11.8178f)
                lineTo(20.7123f, 11.273f)
                curveTo(20.7116f, 11.2722f, 20.7108f, 11.2715f, 20.7101f, 11.2708f)
                curveTo(18.2199f, 8.7817f, 14.8726f, 7.3473f, 11.3621f, 7.2548f)
                curveTo(11.3781f, 8.6414f, 11.7377f, 10.0185f, 12.4304f, 11.2553f)
                close()
                moveTo(11.4794f, 5.7575f)
                curveTo(14.9385f, 5.8663f, 18.2504f, 7.1496f, 20.8747f, 9.3833f)
                curveTo(19.7905f, 5.7005f, 16.4763f, 2.9728f, 12.4946f, 2.763f)
                lineTo(12.0065f, 3.9343f)
                curveTo(11.7598f, 4.5265f, 11.5844f, 5.1382f, 11.4794f, 5.7575f)
                close()
                moveTo(10.8453f, 2.8214f)
                curveTo(9.8705f, 2.9428f, 8.9429f, 3.2158f, 8.0866f, 3.6161f)
                curveTo(6.6921f, 7.1468f, 6.7046f, 11.0203f, 8.124f, 14.5448f)
                curveTo(9.216f, 13.9342f, 10.1898f, 13.1058f, 10.9777f, 12.0928f)
                lineTo(11.0955f, 11.9413f)
                curveTo(9.641f, 9.3109f, 9.4585f, 6.1496f, 10.6219f, 3.3574f)
                lineTo(10.8453f, 2.8214f)
                close()
                moveTo(6.7595f, 15.1716f)
                curveTo(5.4126f, 11.8684f, 5.1906f, 8.2786f, 6.0936f, 4.8809f)
                curveTo(4.0508f, 6.5777f, 2.75f, 9.1369f, 2.75f, 12.0f)
                curveTo(2.75f, 13.3349f, 3.0328f, 14.6037f, 3.5417f, 15.7499f)
                curveTo(4.6532f, 15.745f, 5.7406f, 15.5451f, 6.7595f, 15.1716f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
