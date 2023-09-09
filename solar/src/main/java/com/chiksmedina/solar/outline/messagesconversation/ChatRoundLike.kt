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

public val MessagesConversationGroup.ChatRoundLike: ImageVector
    get() {
        if (_chatRoundLike != null) {
            return _chatRoundLike!!
        }
        _chatRoundLike = Builder(name = "ChatRoundLike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 13.4811f, 3.0975f, 14.8788f, 3.7148f, 16.1181f)
                curveTo(3.9625f, 16.6155f, 4.0579f, 17.2103f, 3.9016f, 17.7945f)
                lineTo(3.306f, 20.0205f)
                curveTo(3.1966f, 20.4293f, 3.5707f, 20.8034f, 3.9795f, 20.694f)
                lineTo(6.2055f, 20.0984f)
                curveTo(6.7897f, 19.9421f, 7.3845f, 20.0375f, 7.8819f, 20.2852f)
                curveTo(9.1212f, 20.9025f, 10.5189f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(10.2817f, 22.75f, 8.6555f, 22.3463f, 7.2132f, 21.6279f)
                curveTo(6.9979f, 21.5207f, 6.7781f, 21.4979f, 6.5932f, 21.5474f)
                lineTo(4.3672f, 22.143f)
                curveTo(2.8434f, 22.5507f, 1.4493f, 21.1566f, 1.857f, 19.6328f)
                lineTo(2.4526f, 17.4068f)
                curveTo(2.5021f, 17.2219f, 2.4793f, 17.0021f, 2.3721f, 16.7869f)
                curveTo(1.6537f, 15.3445f, 1.25f, 13.7183f, 1.25f, 12.0f)
                close()
                moveTo(15.272f, 7.8221f)
                curveTo(16.507f, 8.2839f, 17.25f, 9.539f, 17.25f, 11.1084f)
                curveTo(17.25f, 12.0241f, 16.8154f, 12.8821f, 16.2951f, 13.5946f)
                curveTo(15.766f, 14.3192f, 15.0855f, 14.9787f, 14.4574f, 15.513f)
                curveTo(14.4262f, 15.5396f, 14.3952f, 15.566f, 14.3644f, 15.5923f)
                curveTo(13.6274f, 16.2207f, 13.0148f, 16.7431f, 12.0f, 16.7431f)
                curveTo(10.9852f, 16.7431f, 10.3726f, 16.2207f, 9.6356f, 15.5923f)
                curveTo(9.6049f, 15.566f, 9.5738f, 15.5396f, 9.5426f, 15.513f)
                curveTo(8.9145f, 14.9786f, 8.234f, 14.3192f, 7.7049f, 13.5946f)
                curveTo(7.1846f, 12.8821f, 6.75f, 12.0241f, 6.75f, 11.1084f)
                curveTo(6.75f, 9.539f, 7.493f, 8.2839f, 8.728f, 7.8221f)
                curveTo(9.7709f, 7.4322f, 10.9575f, 7.6854f, 12.0f, 8.4956f)
                curveTo(13.0425f, 7.6854f, 14.2291f, 7.4322f, 15.272f, 7.8221f)
                close()
                moveTo(14.7467f, 9.2271f)
                curveTo(14.2295f, 9.0337f, 13.4049f, 9.137f, 12.5359f, 10.0245f)
                curveTo(12.3948f, 10.1686f, 12.2017f, 10.2498f, 12.0f, 10.2498f)
                curveTo(11.7983f, 10.2498f, 11.6052f, 10.1686f, 11.4641f, 10.0245f)
                curveTo(10.5951f, 9.137f, 9.7705f, 9.0337f, 9.2533f, 9.2271f)
                curveTo(8.7445f, 9.4174f, 8.25f, 10.0007f, 8.25f, 11.1084f)
                curveTo(8.25f, 11.5612f, 8.4748f, 12.1053f, 8.9164f, 12.71f)
                curveTo(9.3491f, 13.3027f, 9.9329f, 13.8757f, 10.5145f, 14.3705f)
                curveTo(11.3828f, 15.1091f, 11.586f, 15.2431f, 12.0f, 15.2431f)
                curveTo(12.414f, 15.2431f, 12.6172f, 15.1091f, 13.4855f, 14.3705f)
                curveTo(14.0671f, 13.8757f, 14.6509f, 13.3027f, 15.0837f, 12.71f)
                curveTo(15.5252f, 12.1053f, 15.75f, 11.5612f, 15.75f, 11.1084f)
                curveTo(15.75f, 10.0007f, 15.2555f, 9.4174f, 14.7467f, 9.2271f)
                close()
            }
        }
        .build()
        return _chatRoundLike!!
    }

private var _chatRoundLike: ImageVector? = null
