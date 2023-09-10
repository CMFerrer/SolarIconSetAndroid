package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(
            name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.124f, 4.885f)
                curveTo(15.1368f, 4.8964f, 15.1497f, 4.9078f, 15.1626f, 4.9193f)
                lineTo(19.1765f, 8.4872f)
                curveTo(19.9254f, 9.1529f, 20.5463f, 9.7047f, 20.9726f, 10.2057f)
                curveTo(21.4206f, 10.7322f, 21.7396f, 11.299f, 21.7396f, 12.0005f)
                curveTo(21.7396f, 12.7019f, 21.4206f, 13.2687f, 20.9726f, 13.7952f)
                curveTo(20.5463f, 14.2962f, 19.9254f, 14.848f, 19.1765f, 15.5137f)
                lineTo(15.1626f, 19.0816f)
                curveTo(15.1497f, 19.0931f, 15.1368f, 19.1045f, 15.124f, 19.1159f)
                curveTo(14.7996f, 19.4044f, 14.4968f, 19.6736f, 14.2352f, 19.8464f)
                curveTo(13.9783f, 20.016f, 13.5112f, 20.2623f, 12.9879f, 20.0273f)
                curveTo(12.4647f, 19.7923f, 12.3385f, 19.2796f, 12.2946f, 18.9749f)
                curveTo(12.2499f, 18.6646f, 12.2499f, 18.2595f, 12.25f, 17.8253f)
                curveTo(12.25f, 17.8081f, 12.25f, 17.7909f, 12.25f, 17.7736f)
                verticalLineTo(16.2051f)
                curveTo(10.7985f, 16.3051f, 9.3276f, 16.6906f, 8.041f, 17.3175f)
                curveTo(6.5281f, 18.0547f, 5.3198f, 19.1f, 4.6641f, 20.3491f)
                curveTo(4.5037f, 20.6546f, 4.1555f, 20.8112f, 3.8205f, 20.7286f)
                curveTo(3.4854f, 20.646f, 3.25f, 20.3455f, 3.25f, 20.0005f)
                curveTo(3.25f, 15.2795f, 4.6314f, 12.2055f, 6.6065f, 10.3157f)
                curveTo(8.3281f, 8.6685f, 10.4264f, 7.9925f, 12.25f, 7.8511f)
                verticalLineTo(6.2273f)
                curveTo(12.25f, 6.21f, 12.25f, 6.1928f, 12.25f, 6.1756f)
                curveTo(12.2499f, 5.7414f, 12.2499f, 5.3363f, 12.2946f, 5.026f)
                curveTo(12.3385f, 4.7214f, 12.4647f, 4.2086f, 12.9879f, 3.9736f)
                curveTo(13.5112f, 3.7386f, 13.9783f, 3.985f, 14.2352f, 4.1546f)
                curveTo(14.4968f, 4.3273f, 14.7996f, 4.5965f, 15.124f, 4.885f)
                close()
                moveTo(13.7531f, 5.6774f)
                curveTo(13.8661f, 5.7743f, 14.0011f, 5.8938f, 14.1661f, 6.0404f)
                lineTo(18.1384f, 9.5714f)
                curveTo(18.9395f, 10.2835f, 19.48f, 10.7662f, 19.8302f, 11.1778f)
                curveTo(20.1665f, 11.573f, 20.2396f, 11.8038f, 20.2396f, 12.0005f)
                curveTo(20.2396f, 12.1971f, 20.1665f, 12.4279f, 19.8302f, 12.8231f)
                curveTo(19.48f, 13.2347f, 18.9395f, 13.7174f, 18.1384f, 14.4295f)
                lineTo(14.1661f, 17.9605f)
                curveTo(14.0011f, 18.1071f, 13.8661f, 18.2266f, 13.7531f, 18.3235f)
                curveTo(13.7504f, 18.1746f, 13.75f, 17.9943f, 13.75f, 17.7736f)
                verticalLineTo(15.429f)
                curveTo(13.75f, 15.0148f, 13.4142f, 14.679f, 13.0f, 14.679f)
                curveTo(11.0874f, 14.679f, 9.0999f, 15.133f, 7.384f, 15.9691f)
                curveTo(6.4652f, 16.4168f, 5.6098f, 16.9815f, 4.8839f, 17.6572f)
                curveTo(5.2527f, 14.6103f, 6.3424f, 12.6444f, 7.6435f, 11.3995f)
                curveTo(9.2635f, 9.8494f, 11.3104f, 9.3219f, 13.0f, 9.3219f)
                curveTo(13.4142f, 9.3219f, 13.75f, 8.9861f, 13.75f, 8.5719f)
                verticalLineTo(6.2273f)
                curveTo(13.75f, 6.0066f, 13.7504f, 5.8263f, 13.7531f, 5.6774f)
                close()
            }
        }
            .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
