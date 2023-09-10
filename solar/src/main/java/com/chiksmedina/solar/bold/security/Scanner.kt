package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.Scanner: ImageVector
    get() {
        if (_scanner != null) {
            return _scanner!!
        }
        _scanner = Builder(
            name = "Scanner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(10.004f, 5.7517f)
                curveTo(10.4182f, 5.7495f, 10.7522f, 5.4119f, 10.75f, 4.9977f)
                curveTo(10.7478f, 4.5835f, 10.4102f, 4.2495f, 9.996f, 4.2517f)
                curveTo(8.9143f, 4.2575f, 8.0158f, 4.2821f, 7.2826f, 4.4104f)
                curveTo(6.5307f, 4.542f, 5.8879f, 4.7924f, 5.3614f, 5.2938f)
                curveTo(4.9063f, 5.7272f, 4.6019f, 6.1662f, 4.4363f, 6.7968f)
                curveTo(4.2861f, 7.3683f, 4.2594f, 8.0715f, 4.2523f, 8.9943f)
                curveTo(4.2491f, 9.4085f, 4.5823f, 9.7468f, 4.9965f, 9.75f)
                curveTo(5.4107f, 9.7531f, 5.7491f, 9.4199f, 5.7523f, 9.0057f)
                curveTo(5.7595f, 8.057f, 5.792f, 7.5395f, 5.887f, 7.1779f)
                curveTo(5.9665f, 6.8752f, 6.0931f, 6.6684f, 6.3959f, 6.38f)
                curveTo(6.6379f, 6.1495f, 6.9681f, 5.9882f, 7.5411f, 5.888f)
                curveTo(8.1327f, 5.7845f, 8.9107f, 5.7575f, 10.004f, 5.7517f)
                close()
                moveTo(14.0041f, 4.2517f)
                curveTo(13.5899f, 4.2495f, 13.2523f, 4.5835f, 13.2501f, 4.9977f)
                curveTo(13.2479f, 5.4119f, 13.5819f, 5.7495f, 13.9961f, 5.7517f)
                curveTo(15.0894f, 5.7575f, 15.8674f, 5.7845f, 16.4589f, 5.888f)
                curveTo(17.0319f, 5.9882f, 17.3621f, 6.1496f, 17.6041f, 6.38f)
                curveTo(17.9069f, 6.6684f, 18.0335f, 6.8752f, 18.113f, 7.1779f)
                curveTo(18.208f, 7.5395f, 18.2405f, 8.057f, 18.2477f, 9.0057f)
                curveTo(18.2509f, 9.4199f, 18.5893f, 9.7531f, 19.0035f, 9.75f)
                curveTo(19.4177f, 9.7468f, 19.7509f, 9.4085f, 19.7477f, 8.9943f)
                curveTo(19.7406f, 8.0715f, 19.7139f, 7.3683f, 19.5637f, 6.7968f)
                curveTo(19.3981f, 6.1662f, 19.0937f, 5.7272f, 18.6386f, 5.2938f)
                curveTo(18.1121f, 4.7924f, 17.4693f, 4.542f, 16.7174f, 4.4104f)
                curveTo(15.9842f, 4.2822f, 15.0858f, 4.2575f, 14.0041f, 4.2517f)
                close()
                moveTo(5.0f, 11.2501f)
                curveTo(4.5858f, 11.2501f, 4.25f, 11.5858f, 4.25f, 12.0001f)
                curveTo(4.25f, 12.4143f, 4.5858f, 12.7501f, 5.0f, 12.7501f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 12.7501f, 19.75f, 12.4143f, 19.75f, 12.0001f)
                curveTo(19.75f, 11.5858f, 19.4142f, 11.2501f, 19.0f, 11.2501f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.7523f, 14.9944f)
                curveTo(5.7491f, 14.5802f, 5.4107f, 14.247f, 4.9965f, 14.2501f)
                curveTo(4.5823f, 14.2533f, 4.2491f, 14.5916f, 4.2523f, 15.0058f)
                curveTo(4.2594f, 15.9286f, 4.2861f, 16.6318f, 4.4363f, 17.2034f)
                curveTo(4.6019f, 17.8339f, 4.9063f, 18.2729f, 5.3614f, 18.7063f)
                curveTo(5.8878f, 19.2077f, 6.5307f, 19.4581f, 7.2826f, 19.5897f)
                curveTo(8.0158f, 19.718f, 8.9142f, 19.7427f, 9.9959f, 19.7484f)
                curveTo(10.4101f, 19.7506f, 10.7477f, 19.4166f, 10.7499f, 19.0024f)
                curveTo(10.7521f, 18.5882f, 10.4181f, 18.2506f, 10.0039f, 18.2484f)
                curveTo(8.9107f, 18.2426f, 8.1326f, 18.2156f, 7.5411f, 18.1121f)
                curveTo(6.9681f, 18.0119f, 6.6379f, 17.8506f, 6.3959f, 17.6201f)
                curveTo(6.0931f, 17.3318f, 5.9665f, 17.1249f, 5.887f, 16.8223f)
                curveTo(5.792f, 16.4606f, 5.7595f, 15.9431f, 5.7523f, 14.9944f)
                close()
                moveTo(19.7477f, 15.0058f)
                curveTo(19.7509f, 14.5916f, 19.4177f, 14.2533f, 19.0035f, 14.2501f)
                curveTo(18.5893f, 14.247f, 18.2509f, 14.5802f, 18.2477f, 14.9944f)
                curveTo(18.2405f, 15.9431f, 18.208f, 16.4606f, 18.113f, 16.8223f)
                curveTo(18.0335f, 17.1249f, 17.9069f, 17.3318f, 17.6041f, 17.6201f)
                curveTo(17.3621f, 17.8506f, 17.0319f, 18.0119f, 16.4589f, 18.1121f)
                curveTo(15.8674f, 18.2156f, 15.0894f, 18.2426f, 13.9961f, 18.2484f)
                curveTo(13.5819f, 18.2506f, 13.2479f, 18.5882f, 13.2501f, 19.0024f)
                curveTo(13.2523f, 19.4166f, 13.5899f, 19.7506f, 14.0041f, 19.7484f)
                curveTo(15.0858f, 19.7427f, 15.9842f, 19.718f, 16.7174f, 19.5897f)
                curveTo(17.4693f, 19.4581f, 18.1121f, 19.2077f, 18.6386f, 18.7063f)
                curveTo(19.0937f, 18.2729f, 19.3981f, 17.8339f, 19.5637f, 17.2034f)
                curveTo(19.7139f, 16.6318f, 19.7406f, 15.9286f, 19.7477f, 15.0058f)
                close()
            }
        }
            .build()
        return _scanner!!
    }

private var _scanner: ImageVector? = null
