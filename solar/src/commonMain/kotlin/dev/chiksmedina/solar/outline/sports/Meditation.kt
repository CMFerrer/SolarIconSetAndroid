package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(11.0335f, 2.75f, 10.25f, 3.5335f, 10.25f, 4.5f)
                curveTo(10.25f, 5.4665f, 11.0335f, 6.25f, 12.0f, 6.25f)
                curveTo(12.9665f, 6.25f, 13.75f, 5.4665f, 13.75f, 4.5f)
                curveTo(13.75f, 3.5335f, 12.9665f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(8.75f, 4.5f)
                curveTo(8.75f, 2.7051f, 10.2051f, 1.25f, 12.0f, 1.25f)
                curveTo(13.7949f, 1.25f, 15.25f, 2.7051f, 15.25f, 4.5f)
                curveTo(15.25f, 6.2949f, 13.7949f, 7.75f, 12.0f, 7.75f)
                curveTo(10.2051f, 7.75f, 8.75f, 6.2949f, 8.75f, 4.5f)
                close()
                moveTo(12.8687f, 9.8221f)
                curveTo(12.2981f, 9.726f, 11.7019f, 9.726f, 11.1312f, 9.8221f)
                curveTo(8.6235f, 10.2445f, 6.75f, 12.4461f, 6.75f, 15.0196f)
                curveTo(6.75f, 15.5842f, 6.4343f, 16.1049f, 5.9271f, 16.3612f)
                lineTo(3.3382f, 17.6694f)
                curveTo(2.9685f, 17.8562f, 2.5174f, 17.7079f, 2.3306f, 17.3382f)
                curveTo(2.1438f, 16.9685f, 2.292f, 16.5174f, 2.6617f, 16.3306f)
                lineTo(5.2492f, 15.0231f)
                curveTo(5.2496f, 15.0224f, 5.25f, 15.0213f, 5.25f, 15.0196f)
                curveTo(5.25f, 11.7143f, 7.6518f, 8.887f, 10.8821f, 8.3429f)
                curveTo(11.6176f, 8.219f, 12.3823f, 8.219f, 13.1179f, 8.3429f)
                curveTo(16.3481f, 8.887f, 18.75f, 11.7143f, 18.75f, 15.0196f)
                curveTo(18.75f, 15.0213f, 18.7503f, 15.0224f, 18.7507f, 15.0231f)
                lineTo(21.3382f, 16.3306f)
                curveTo(21.7079f, 16.5174f, 21.8562f, 16.9685f, 21.6694f, 17.3382f)
                curveTo(21.4826f, 17.7079f, 21.0314f, 17.8562f, 20.6617f, 17.6694f)
                lineTo(18.0729f, 16.3612f)
                curveTo(17.5657f, 16.1049f, 17.25f, 15.5842f, 17.25f, 15.0196f)
                curveTo(17.25f, 12.4461f, 15.3764f, 10.2445f, 12.8687f, 9.8221f)
                close()
                moveTo(9.95f, 15.4f)
                curveTo(10.2813f, 15.6485f, 10.3485f, 16.1186f, 10.1f, 16.45f)
                lineTo(9.0536f, 17.8451f)
                curveTo(9.0263f, 17.8815f, 9.0049f, 17.9101f, 8.9827f, 17.9381f)
                curveTo(8.621f, 18.3954f, 8.1234f, 18.7258f, 7.5616f, 18.8817f)
                curveTo(7.5272f, 18.8913f, 7.4925f, 18.9f, 7.4484f, 18.911f)
                lineTo(7.4409f, 18.9129f)
                lineTo(5.9561f, 19.284f)
                curveTo(5.2473f, 19.4613f, 4.75f, 20.0982f, 4.75f, 20.8288f)
                curveTo(4.75f, 21.0614f, 4.9385f, 21.25f, 5.1711f, 21.25f)
                horizontalLineTo(6.7273f)
                curveTo(7.3437f, 21.25f, 7.5923f, 21.2488f, 7.8294f, 21.2209f)
                curveTo(8.4076f, 21.153f, 8.9657f, 20.967f, 9.469f, 20.6744f)
                curveTo(9.6754f, 20.5544f, 9.875f, 20.4062f, 10.3682f, 20.0364f)
                lineTo(10.55f, 19.9f)
                lineTo(12.55f, 18.4f)
                curveTo(12.8813f, 18.1515f, 13.3515f, 18.2186f, 13.6f, 18.55f)
                curveTo(13.8485f, 18.8814f, 13.7814f, 19.3515f, 13.45f, 19.6f)
                lineTo(12.5453f, 20.2785f)
                lineTo(13.803f, 20.7501f)
                curveTo(14.4297f, 20.9851f, 14.6825f, 21.0784f, 14.9395f, 21.1385f)
                curveTo(15.078f, 21.1709f, 15.2181f, 21.1963f, 15.3591f, 21.2146f)
                curveTo(15.6208f, 21.2486f, 15.8903f, 21.25f, 16.5596f, 21.25f)
                horizontalLineTo(18.8288f)
                curveTo(19.0614f, 21.25f, 19.25f, 21.0614f, 19.25f, 20.8288f)
                curveTo(19.25f, 20.0982f, 18.7527f, 19.4613f, 18.0438f, 19.284f)
                lineTo(16.5512f, 18.9109f)
                curveTo(16.5073f, 18.8999f, 16.4727f, 18.8913f, 16.4383f, 18.8817f)
                curveTo(15.8766f, 18.7258f, 15.3789f, 18.3954f, 15.0172f, 17.9381f)
                curveTo(14.9951f, 17.9102f, 14.9735f, 17.8814f, 14.9463f, 17.8451f)
                lineTo(14.9417f, 17.839f)
                lineTo(13.9f, 16.45f)
                curveTo(13.6515f, 16.1186f, 13.7186f, 15.6485f, 14.05f, 15.4f)
                curveTo(14.3813f, 15.1515f, 14.8515f, 15.2186f, 15.1f, 15.55f)
                lineTo(16.1417f, 16.939f)
                curveTo(16.1757f, 16.9843f, 16.185f, 16.9966f, 16.1936f, 17.0075f)
                curveTo(16.358f, 17.2153f, 16.5842f, 17.3655f, 16.8396f, 17.4364f)
                curveTo(16.853f, 17.4401f, 16.8677f, 17.4439f, 16.9229f, 17.4576f)
                lineTo(18.4076f, 17.8288f)
                curveTo(19.7843f, 18.173f, 20.75f, 19.4099f, 20.75f, 20.8288f)
                curveTo(20.75f, 21.8899f, 19.8898f, 22.75f, 18.8288f, 22.75f)
                lineTo(16.5079f, 22.75f)
                curveTo(15.9061f, 22.75f, 15.5352f, 22.7501f, 15.1659f, 22.7021f)
                curveTo(14.975f, 22.6773f, 14.7855f, 22.6429f, 14.5981f, 22.5991f)
                curveTo(14.2355f, 22.5144f, 13.8882f, 22.3841f, 13.3248f, 22.1728f)
                lineTo(11.1213f, 21.3465f)
                curveTo(10.7408f, 21.6316f, 10.4897f, 21.8161f, 10.2228f, 21.9713f)
                curveTo(9.5418f, 22.3671f, 8.7868f, 22.6187f, 8.0045f, 22.7107f)
                curveTo(7.6696f, 22.7501f, 7.3289f, 22.75f, 6.7754f, 22.75f)
                horizontalLineTo(5.1711f)
                curveTo(4.1101f, 22.75f, 3.25f, 21.8899f, 3.25f, 20.8288f)
                curveTo(3.25f, 19.4099f, 4.2157f, 18.173f, 5.5923f, 17.8288f)
                lineTo(7.0771f, 17.4576f)
                curveTo(7.1322f, 17.4439f, 7.147f, 17.4401f, 7.1604f, 17.4364f)
                curveTo(7.4157f, 17.3655f, 7.6419f, 17.2153f, 7.8063f, 17.0075f)
                curveTo(7.815f, 16.9966f, 7.8242f, 16.9844f, 7.8583f, 16.939f)
                lineTo(8.9f, 15.55f)
                curveTo(9.1485f, 15.2186f, 9.6186f, 15.1515f, 9.95f, 15.4f)
                close()
            }
        }
            .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
