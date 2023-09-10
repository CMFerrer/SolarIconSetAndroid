package com.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(
            name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4999f, 4.5f)
                curveTo(14.4999f, 5.8807f, 13.3806f, 7.0f, 11.9999f, 7.0f)
                curveTo(10.6192f, 7.0f, 9.4999f, 5.8807f, 9.4999f, 4.5f)
                curveTo(9.4999f, 3.1193f, 10.6192f, 2.0f, 11.9999f, 2.0f)
                curveTo(13.3806f, 2.0f, 14.4999f, 3.1193f, 14.4999f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.8687f, 9.8221f)
                curveTo(12.298f, 9.726f, 11.7018f, 9.726f, 11.1312f, 9.8221f)
                curveTo(8.6235f, 10.2445f, 6.7499f, 12.4461f, 6.7499f, 15.0196f)
                curveTo(6.7499f, 15.5842f, 6.4342f, 16.1049f, 5.927f, 16.3612f)
                lineTo(3.3382f, 17.6694f)
                curveTo(2.9685f, 17.8562f, 2.5173f, 17.7079f, 2.3305f, 17.3382f)
                curveTo(2.1437f, 16.9685f, 2.292f, 16.5174f, 2.6617f, 16.3306f)
                lineTo(5.2492f, 15.0231f)
                lineTo(5.2499f, 15.0196f)
                curveTo(5.2499f, 11.7143f, 7.6518f, 8.887f, 10.882f, 8.3429f)
                curveTo(11.6176f, 8.219f, 12.3823f, 8.219f, 13.1178f, 8.3429f)
                curveTo(16.3481f, 8.887f, 18.7499f, 11.7143f, 18.7499f, 15.0196f)
                lineTo(18.7503f, 15.0224f)
                lineTo(21.3382f, 16.3306f)
                curveTo(21.7079f, 16.5174f, 21.8561f, 16.9685f, 21.6693f, 17.3382f)
                curveTo(21.4825f, 17.7079f, 21.0314f, 17.8562f, 20.6617f, 17.6694f)
                lineTo(18.0728f, 16.3612f)
                curveTo(17.5656f, 16.1049f, 17.2499f, 15.5842f, 17.2499f, 15.0196f)
                curveTo(17.2499f, 12.4461f, 15.3764f, 10.2445f, 12.8687f, 9.8221f)
                close()
                moveTo(9.9499f, 15.4f)
                curveTo(10.2813f, 15.6485f, 10.3484f, 16.1186f, 10.0999f, 16.45f)
                lineTo(9.0534f, 17.8454f)
                curveTo(9.0262f, 17.8816f, 9.0048f, 17.9102f, 8.9827f, 17.9381f)
                curveTo(8.6209f, 18.3954f, 8.1233f, 18.7258f, 7.5616f, 18.8817f)
                curveTo(7.5272f, 18.8913f, 7.4925f, 18.8999f, 7.4485f, 18.9109f)
                lineTo(7.4408f, 18.9129f)
                lineTo(5.956f, 19.284f)
                curveTo(5.2472f, 19.4613f, 4.7499f, 20.0982f, 4.7499f, 20.8288f)
                curveTo(4.7499f, 21.0614f, 4.9385f, 21.25f, 5.1711f, 21.25f)
                horizontalLineTo(6.7272f)
                curveTo(7.3436f, 21.25f, 7.5922f, 21.2488f, 7.8294f, 21.2209f)
                curveTo(8.4075f, 21.153f, 8.9656f, 20.967f, 9.4689f, 20.6744f)
                curveTo(9.6754f, 20.5544f, 9.875f, 20.4062f, 10.3681f, 20.0364f)
                lineTo(12.5499f, 18.4f)
                curveTo(12.8813f, 18.1515f, 13.3514f, 18.2186f, 13.5999f, 18.55f)
                curveTo(13.8484f, 18.8814f, 13.7813f, 19.3515f, 13.4499f, 19.6f)
                lineTo(12.5453f, 20.2785f)
                lineTo(13.8029f, 20.7501f)
                curveTo(14.4296f, 20.9851f, 14.6825f, 21.0784f, 14.9394f, 21.1385f)
                curveTo(15.0779f, 21.1709f, 15.218f, 21.1963f, 15.3591f, 21.2146f)
                curveTo(15.6207f, 21.2486f, 15.8902f, 21.25f, 16.5596f, 21.25f)
                horizontalLineTo(18.8288f)
                curveTo(19.0614f, 21.25f, 19.2499f, 21.0614f, 19.2499f, 20.8288f)
                curveTo(19.2499f, 20.0982f, 18.7526f, 19.4613f, 18.0438f, 19.284f)
                lineTo(16.5511f, 18.9109f)
                curveTo(16.5072f, 18.8999f, 16.4726f, 18.8913f, 16.4383f, 18.8817f)
                curveTo(15.8765f, 18.7258f, 15.3789f, 18.3954f, 15.0172f, 17.9381f)
                curveTo(14.995f, 17.9102f, 14.9735f, 17.8814f, 14.9463f, 17.8452f)
                lineTo(13.8999f, 16.45f)
                curveTo(13.6514f, 16.1186f, 13.7185f, 15.6485f, 14.0499f, 15.4f)
                curveTo(14.3813f, 15.1515f, 14.8514f, 15.2186f, 15.0999f, 15.55f)
                lineTo(16.1416f, 16.939f)
                curveTo(16.1756f, 16.9843f, 16.185f, 16.9966f, 16.1936f, 17.0075f)
                curveTo(16.358f, 17.2153f, 16.5842f, 17.3655f, 16.8395f, 17.4364f)
                curveTo(16.8529f, 17.4401f, 16.8677f, 17.4439f, 16.9228f, 17.4576f)
                lineTo(18.4076f, 17.8288f)
                curveTo(19.7842f, 18.173f, 20.7499f, 19.4099f, 20.7499f, 20.8288f)
                curveTo(20.7499f, 21.8899f, 19.8898f, 22.75f, 18.8288f, 22.75f)
                lineTo(16.5078f, 22.75f)
                curveTo(15.906f, 22.75f, 15.5351f, 22.7501f, 15.1658f, 22.7021f)
                curveTo(14.975f, 22.6773f, 14.7855f, 22.6429f, 14.5981f, 22.5991f)
                curveTo(14.2354f, 22.5144f, 13.8882f, 22.3841f, 13.3247f, 22.1728f)
                lineTo(11.1212f, 21.3465f)
                curveTo(10.7408f, 21.6316f, 10.4897f, 21.8161f, 10.2227f, 21.9713f)
                curveTo(9.5417f, 22.3671f, 8.7867f, 22.6187f, 8.0045f, 22.7107f)
                curveTo(7.6696f, 22.7501f, 7.3288f, 22.75f, 6.7754f, 22.75f)
                lineTo(5.1711f, 22.75f)
                curveTo(4.1101f, 22.75f, 3.2499f, 21.8899f, 3.2499f, 20.8288f)
                curveTo(3.2499f, 19.4099f, 4.2156f, 18.173f, 5.5922f, 17.8288f)
                lineTo(7.077f, 17.4576f)
                curveTo(7.1321f, 17.4439f, 7.1469f, 17.4401f, 7.1603f, 17.4364f)
                curveTo(7.4156f, 17.3655f, 7.6419f, 17.2153f, 7.8063f, 17.0075f)
                curveTo(7.8149f, 16.9966f, 7.8241f, 16.9844f, 7.8582f, 16.939f)
                lineTo(8.8999f, 15.55f)
                curveTo(9.1484f, 15.2186f, 9.6186f, 15.1515f, 9.9499f, 15.4f)
                close()
            }
        }
            .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
