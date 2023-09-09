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

public val SportsGroup.HikingRound: ImageVector
    get() {
        if (_hikingRound != null) {
            return _hikingRound!!
        }
        _hikingRound = Builder(name = "HikingRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 2.75f)
                curveTo(10.5335f, 2.75f, 9.75f, 3.5335f, 9.75f, 4.5f)
                curveTo(9.75f, 5.4665f, 10.5335f, 6.25f, 11.5f, 6.25f)
                curveTo(12.4665f, 6.25f, 13.25f, 5.4665f, 13.25f, 4.5f)
                curveTo(13.25f, 3.5335f, 12.4665f, 2.75f, 11.5f, 2.75f)
                close()
                moveTo(8.25f, 4.5f)
                curveTo(8.25f, 2.7051f, 9.7051f, 1.25f, 11.5f, 1.25f)
                curveTo(13.2949f, 1.25f, 14.75f, 2.7051f, 14.75f, 4.5f)
                curveTo(14.75f, 6.2949f, 13.2949f, 7.75f, 11.5f, 7.75f)
                curveTo(9.7051f, 7.75f, 8.25f, 6.2949f, 8.25f, 4.5f)
                close()
                moveTo(19.0f, 7.25f)
                curveTo(19.4142f, 7.25f, 19.75f, 7.5858f, 19.75f, 8.0f)
                verticalLineTo(10.4943f)
                curveTo(19.75f, 10.4978f, 19.75f, 10.5014f, 19.75f, 10.5049f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(11.9941f)
                curveTo(16.5565f, 12.9799f, 14.456f, 13.0665f, 12.6646f, 12.1708f)
                curveTo(12.6474f, 12.1622f, 12.6306f, 12.153f, 12.6142f, 12.1431f)
                curveTo(11.9234f, 11.7287f, 11.0363f, 12.1741f, 10.9562f, 12.9756f)
                lineTo(10.8876f, 13.6617f)
                curveTo(10.8295f, 14.243f, 11.1062f, 14.807f, 11.6016f, 15.1166f)
                lineTo(11.9349f, 15.3249f)
                curveTo(13.6853f, 16.4188f, 14.8215f, 18.2701f, 15.0044f, 20.3261f)
                lineTo(15.1475f, 21.9335f)
                curveTo(15.1842f, 22.3461f, 14.8795f, 22.7103f, 14.4669f, 22.747f)
                curveTo(14.0543f, 22.7838f, 13.6901f, 22.4791f, 13.6534f, 22.0665f)
                lineTo(13.5103f, 20.4591f)
                curveTo(13.3691f, 18.8713f, 12.4916f, 17.4417f, 11.1399f, 16.5969f)
                lineTo(10.8066f, 16.3886f)
                curveTo(9.8273f, 15.7765f, 9.2801f, 14.6616f, 9.395f, 13.5125f)
                lineTo(9.4636f, 12.8264f)
                curveTo(9.6522f, 10.9409f, 11.7282f, 9.8883f, 13.3582f, 10.8404f)
                curveTo(14.9095f, 11.605f, 16.7667f, 11.3848f, 18.0966f, 10.2766f)
                lineTo(18.25f, 10.1487f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 7.5858f, 18.5858f, 7.25f, 19.0f, 7.25f)
                close()
                moveTo(9.7487f, 9.955f)
                curveTo(9.7736f, 10.3684f, 9.4585f, 10.7238f, 9.0451f, 10.7486f)
                lineTo(6.6565f, 10.8924f)
                curveTo(6.2435f, 10.9172f, 5.8909f, 11.2045f, 5.7831f, 11.608f)
                curveTo(5.6881f, 11.9632f, 5.8017f, 12.3411f, 6.0752f, 12.5843f)
                lineTo(8.162f, 14.4395f)
                curveTo(8.4716f, 14.7147f, 8.4994f, 15.1887f, 8.2242f, 15.4983f)
                curveTo(7.949f, 15.8079f, 7.4749f, 15.8357f, 7.1654f, 15.5605f)
                lineTo(5.0786f, 13.7053f)
                curveTo(4.3806f, 13.0848f, 4.0928f, 12.1229f, 4.3339f, 11.2207f)
                curveTo(4.608f, 10.1952f, 5.5065f, 9.4589f, 6.5664f, 9.3951f)
                lineTo(8.955f, 9.2514f)
                curveTo(9.3684f, 9.2265f, 9.7238f, 9.5415f, 9.7487f, 9.955f)
                close()
                moveTo(9.1907f, 16.7746f)
                curveTo(9.5913f, 16.8799f, 9.8307f, 17.29f, 9.7254f, 17.6907f)
                lineTo(9.0f, 17.5f)
                curveTo(9.7254f, 17.6906f, 9.7254f, 17.6906f, 9.7254f, 17.6907f)
                lineTo(9.7248f, 17.693f)
                lineTo(9.7235f, 17.6976f)
                lineTo(9.7192f, 17.7137f)
                lineTo(9.7033f, 17.7718f)
                curveTo(9.6896f, 17.8213f, 9.6696f, 17.892f, 9.6439f, 17.9791f)
                curveTo(9.5925f, 18.153f, 9.5179f, 18.3942f, 9.4242f, 18.665f)
                curveTo(9.2425f, 19.1898f, 8.9684f, 19.8881f, 8.6282f, 20.4097f)
                curveTo(8.2708f, 20.9577f, 7.7098f, 21.5113f, 7.2771f, 21.903f)
                curveTo(7.0538f, 22.1051f, 6.8509f, 22.2763f, 6.7035f, 22.3973f)
                curveTo(6.6297f, 22.4579f, 6.5694f, 22.5062f, 6.527f, 22.5398f)
                lineTo(6.4773f, 22.579f)
                lineTo(6.4634f, 22.5897f)
                lineTo(6.4594f, 22.5928f)
                lineTo(6.4582f, 22.5938f)
                curveTo(6.4581f, 22.5939f, 6.4574f, 22.5944f, 6.0132f, 22.0171f)
                lineTo(6.4582f, 22.5938f)
                curveTo(6.1299f, 22.8464f, 5.6583f, 22.7857f, 5.4057f, 22.4574f)
                curveTo(5.1531f, 22.1292f, 5.2143f, 21.6584f, 5.5424f, 21.4058f)
                curveTo(5.5424f, 21.4058f, 5.5424f, 21.4058f, 5.5424f, 21.4058f)
                lineTo(5.5447f, 21.404f)
                lineTo(5.5544f, 21.3964f)
                lineTo(5.5954f, 21.3642f)
                curveTo(5.6317f, 21.3354f, 5.6853f, 21.2925f, 5.7518f, 21.2379f)
                curveTo(5.8852f, 21.1284f, 6.0691f, 20.9732f, 6.2704f, 20.7909f)
                curveTo(6.6869f, 20.4139f, 7.1258f, 19.9675f, 7.3718f, 19.5903f)
                curveTo(7.6061f, 19.2311f, 7.8319f, 18.6794f, 8.0067f, 18.1744f)
                curveTo(8.0912f, 17.9303f, 8.1588f, 17.7117f, 8.2052f, 17.5544f)
                curveTo(8.2284f, 17.476f, 8.2461f, 17.4133f, 8.2579f, 17.3708f)
                lineTo(8.271f, 17.3231f)
                lineTo(8.274f, 17.3117f)
                lineTo(8.2746f, 17.3094f)
                curveTo(8.2746f, 17.3094f, 8.2746f, 17.3094f, 8.2746f, 17.3094f)
                curveTo(8.38f, 16.9089f, 8.7901f, 16.6694f, 9.1907f, 16.7746f)
                close()
            }
        }
        .build()
        return _hikingRound!!
    }

private var _hikingRound: ImageVector? = null
