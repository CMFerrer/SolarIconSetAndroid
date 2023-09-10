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

val MessagesConversationGroup.LetterOpened: ImageVector
    get() {
        if (_letterOpened != null) {
            return _letterOpened!!
        }
        _letterOpened = Builder(
            name = "LetterOpened", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9463f, 1.25f)
                horizontalLineTo(13.0537f)
                curveTo(14.1865f, 1.25f, 15.1123f, 1.25f, 15.8431f, 1.3482f)
                curveTo(16.6071f, 1.4509f, 17.2694f, 1.6732f, 17.7981f, 2.2019f)
                curveTo(18.3268f, 2.7306f, 18.5491f, 3.3929f, 18.6518f, 4.1569f)
                curveTo(18.7023f, 4.5326f, 18.7268f, 4.9598f, 18.7388f, 5.4401f)
                curveTo(19.797f, 5.6109f, 20.6642f, 5.9469f, 21.3588f, 6.6414f)
                curveTo(22.1071f, 7.3898f, 22.4392f, 8.3387f, 22.5969f, 9.5112f)
                curveTo(22.75f, 10.6504f, 22.75f, 12.106f, 22.75f, 13.9438f)
                verticalLineTo(14.0566f)
                curveTo(22.75f, 15.8944f, 22.75f, 17.35f, 22.5969f, 18.4892f)
                curveTo(22.4392f, 19.6616f, 22.1071f, 20.6106f, 21.3588f, 21.359f)
                curveTo(20.6104f, 22.1073f, 19.6614f, 22.4394f, 18.489f, 22.5971f)
                curveTo(17.3498f, 22.7502f, 15.8942f, 22.7502f, 14.0564f, 22.7502f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.7502f, 6.6502f, 22.7502f, 5.511f, 22.5971f)
                curveTo(4.3386f, 22.4394f, 3.3896f, 22.1073f, 2.6412f, 21.359f)
                curveTo(1.8929f, 20.6106f, 1.5608f, 19.6616f, 1.4031f, 18.4892f)
                curveTo(1.25f, 17.35f, 1.25f, 15.8944f, 1.25f, 14.0566f)
                verticalLineTo(13.9438f)
                curveTo(1.25f, 12.106f, 1.25f, 10.6504f, 1.4031f, 9.5112f)
                curveTo(1.5608f, 8.3387f, 1.8929f, 7.3898f, 2.6412f, 6.6414f)
                curveTo(3.3358f, 5.9469f, 4.203f, 5.6109f, 5.2612f, 5.4401f)
                curveTo(5.2732f, 4.9598f, 5.2977f, 4.5326f, 5.3482f, 4.1569f)
                curveTo(5.4509f, 3.3929f, 5.6732f, 2.7306f, 6.2019f, 2.2019f)
                curveTo(6.7306f, 1.6732f, 7.3929f, 1.4509f, 8.1569f, 1.3482f)
                curveTo(8.8877f, 1.25f, 9.8135f, 1.25f, 10.9463f, 1.25f)
                close()
                moveTo(5.25f, 6.9661f)
                curveTo(4.519f, 7.1129f, 4.0557f, 7.3482f, 3.7019f, 7.7021f)
                curveTo(3.2787f, 8.1253f, 3.025f, 8.705f, 2.8898f, 9.711f)
                curveTo(2.7516f, 10.7387f, 2.75f, 12.0934f, 2.75f, 14.0002f)
                curveTo(2.75f, 15.907f, 2.7516f, 17.2617f, 2.8898f, 18.2893f)
                curveTo(3.025f, 19.2954f, 3.2787f, 19.8751f, 3.7019f, 20.2983f)
                curveTo(4.1251f, 20.7215f, 4.7048f, 20.9752f, 5.7108f, 21.1104f)
                curveTo(6.7385f, 21.2486f, 8.0932f, 21.2502f, 10.0f, 21.2502f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.2502f, 17.2615f, 21.2486f, 18.2892f, 21.1104f)
                curveTo(19.2952f, 20.9752f, 19.8749f, 20.7215f, 20.2981f, 20.2983f)
                curveTo(20.7213f, 19.8751f, 20.975f, 19.2954f, 21.1102f, 18.2893f)
                curveTo(21.2484f, 17.2617f, 21.25f, 15.907f, 21.25f, 14.0002f)
                curveTo(21.25f, 12.0934f, 21.2484f, 10.7387f, 21.1102f, 9.711f)
                curveTo(20.975f, 8.705f, 20.7213f, 8.1253f, 20.2981f, 7.7021f)
                curveTo(19.9443f, 7.3482f, 19.481f, 7.1129f, 18.75f, 6.9661f)
                verticalLineTo(8.1265f)
                curveTo(18.75f, 8.1726f, 18.75f, 8.2182f, 18.7501f, 8.2633f)
                curveTo(18.7509f, 9.0493f, 18.7516f, 9.6719f, 18.4904f, 10.2297f)
                curveTo(18.2291f, 10.7874f, 17.7504f, 11.1855f, 17.146f, 11.6881f)
                curveTo(17.1114f, 11.7169f, 17.0763f, 11.746f, 17.0409f, 11.7756f)
                lineTo(16.2837f, 12.4066f)
                curveTo(15.3973f, 13.1452f, 14.6789f, 13.7439f, 14.0448f, 14.1517f)
                curveTo(13.3843f, 14.5765f, 12.7411f, 14.8449f, 12.0f, 14.8449f)
                curveTo(11.2589f, 14.8449f, 10.6157f, 14.5765f, 9.9552f, 14.1517f)
                curveTo(9.3211f, 13.7439f, 8.6027f, 13.1452f, 7.7164f, 12.4066f)
                lineTo(6.9591f, 11.7756f)
                curveTo(6.9237f, 11.746f, 6.8886f, 11.7169f, 6.854f, 11.6881f)
                curveTo(6.2496f, 11.1855f, 5.7709f, 10.7874f, 5.5096f, 10.2297f)
                curveTo(5.2484f, 9.6719f, 5.2491f, 9.0493f, 5.2499f, 8.2633f)
                curveTo(5.2499f, 8.2182f, 5.25f, 8.1726f, 5.25f, 8.1265f)
                lineTo(5.25f, 6.9661f)
                close()
                moveTo(8.3568f, 2.8348f)
                curveTo(7.7591f, 2.9152f, 7.4661f, 3.059f, 7.2626f, 3.2626f)
                curveTo(7.059f, 3.4661f, 6.9152f, 3.7591f, 6.8348f, 4.3568f)
                curveTo(6.7516f, 4.9759f, 6.75f, 5.8003f, 6.75f, 7.0f)
                verticalLineTo(8.1265f)
                curveTo(6.75f, 9.1178f, 6.7666f, 9.3769f, 6.868f, 9.5934f)
                curveTo(6.9695f, 9.81f, 7.1579f, 9.9886f, 7.9194f, 10.6232f)
                lineTo(8.639f, 11.2229f)
                curveTo(9.572f, 12.0004f, 10.2197f, 12.5384f, 10.7666f, 12.8901f)
                curveTo(11.2959f, 13.2306f, 11.6549f, 13.3449f, 12.0f, 13.3449f)
                curveTo(12.3451f, 13.3449f, 12.7041f, 13.2306f, 13.2334f, 12.8901f)
                curveTo(13.7803f, 12.5384f, 14.428f, 12.0004f, 15.361f, 11.2229f)
                lineTo(16.0806f, 10.6232f)
                curveTo(16.8421f, 9.9886f, 17.0305f, 9.81f, 17.132f, 9.5934f)
                curveTo(17.2334f, 9.3769f, 17.25f, 9.1178f, 17.25f, 8.1265f)
                verticalLineTo(7.0f)
                curveTo(17.25f, 5.8003f, 17.2484f, 4.9759f, 17.1652f, 4.3568f)
                curveTo(17.0848f, 3.7591f, 16.941f, 3.4661f, 16.7374f, 3.2626f)
                curveTo(16.5339f, 3.059f, 16.2409f, 2.9152f, 15.6432f, 2.8348f)
                curveTo(15.0241f, 2.7516f, 14.1997f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.8003f, 2.75f, 8.976f, 2.7516f, 8.3568f, 2.8348f)
                close()
                moveTo(9.25f, 6.0f)
                curveTo(9.25f, 5.5858f, 9.5858f, 5.25f, 10.0f, 5.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 5.25f, 14.75f, 5.5858f, 14.75f, 6.0f)
                curveTo(14.75f, 6.4142f, 14.4142f, 6.75f, 14.0f, 6.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 6.75f, 9.25f, 6.4142f, 9.25f, 6.0f)
                close()
                moveTo(10.25f, 9.0f)
                curveTo(10.25f, 8.5858f, 10.5858f, 8.25f, 11.0f, 8.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 8.25f, 13.75f, 8.5858f, 13.75f, 9.0f)
                curveTo(13.75f, 9.4142f, 13.4142f, 9.75f, 13.0f, 9.75f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 9.75f, 10.25f, 9.4142f, 10.25f, 9.0f)
                close()
            }
        }
            .build()
        return _letterOpened!!
    }

private var _letterOpened: ImageVector? = null
