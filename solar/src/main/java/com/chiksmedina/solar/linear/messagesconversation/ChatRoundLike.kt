package com.chiksmedina.solar.linear.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MessagesConversationGroup

public val MessagesConversationGroup.ChatRoundLike: ImageVector
    get() {
        if (_chatRoundLike != null) {
            return _chatRoundLike!!
        }
        _chatRoundLike = Builder(name = "ChatRoundLike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.5997f, 2.3756f, 15.1116f, 3.0435f, 16.4525f)
                curveTo(3.2209f, 16.8088f, 3.28f, 17.2161f, 3.1771f, 17.6006f)
                lineTo(2.5815f, 19.8267f)
                curveTo(2.3229f, 20.793f, 3.207f, 21.677f, 4.1733f, 21.4185f)
                lineTo(6.3994f, 20.8229f)
                curveTo(6.7839f, 20.72f, 7.1912f, 20.7791f, 7.5475f, 20.9565f)
                curveTo(8.8884f, 21.6244f, 10.4003f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0286f, 14.9416f)
                lineTo(9.5426f, 15.5129f)
                lineTo(9.5426f, 15.5129f)
                lineTo(10.0286f, 14.9416f)
                close()
                moveTo(12.0f, 9.4997f)
                lineTo(11.4641f, 10.0244f)
                curveTo(11.6052f, 10.1685f, 11.7983f, 10.2497f, 12.0f, 10.2497f)
                curveTo(12.2017f, 10.2497f, 12.3948f, 10.1685f, 12.5359f, 10.0244f)
                lineTo(12.0f, 9.4997f)
                close()
                moveTo(13.9714f, 14.9416f)
                lineTo(13.4855f, 14.3704f)
                lineTo(13.4855f, 14.3704f)
                lineTo(13.9714f, 14.9416f)
                close()
                moveTo(12.0f, 15.993f)
                lineTo(12.0f, 15.243f)
                lineTo(12.0f, 15.243f)
                lineTo(12.0f, 15.993f)
                close()
                moveTo(10.5145f, 14.3704f)
                curveTo(9.9329f, 13.8756f, 9.3491f, 13.3026f, 8.9164f, 12.7099f)
                curveTo(8.4748f, 12.1052f, 8.25f, 11.5611f, 8.25f, 11.1083f)
                horizontalLineTo(6.75f)
                curveTo(6.75f, 12.024f, 7.1846f, 12.882f, 7.7049f, 13.5945f)
                curveTo(8.234f, 14.3191f, 8.9145f, 14.9785f, 9.5426f, 15.5129f)
                lineTo(10.5145f, 14.3704f)
                close()
                moveTo(8.25f, 11.1083f)
                curveTo(8.25f, 10.0006f, 8.7445f, 9.4173f, 9.2533f, 9.227f)
                curveTo(9.7705f, 9.0337f, 10.5951f, 9.1369f, 11.4641f, 10.0244f)
                lineTo(12.5359f, 8.975f)
                curveTo(11.38f, 7.7945f, 9.9546f, 7.3634f, 8.728f, 7.8221f)
                curveTo(7.493f, 8.2838f, 6.75f, 9.5389f, 6.75f, 11.1083f)
                horizontalLineTo(8.25f)
                close()
                moveTo(14.4574f, 15.5129f)
                curveTo(15.0855f, 14.9786f, 15.766f, 14.3191f, 16.2951f, 13.5945f)
                curveTo(16.8154f, 12.882f, 17.25f, 12.024f, 17.25f, 11.1083f)
                horizontalLineTo(15.75f)
                curveTo(15.75f, 11.5611f, 15.5252f, 12.1052f, 15.0837f, 12.7099f)
                curveTo(14.6509f, 13.3026f, 14.0671f, 13.8756f, 13.4855f, 14.3704f)
                lineTo(14.4574f, 15.5129f)
                close()
                moveTo(17.25f, 11.1083f)
                curveTo(17.25f, 9.5389f, 16.507f, 8.2838f, 15.272f, 7.822f)
                curveTo(14.0454f, 7.3634f, 12.62f, 7.7945f, 11.4641f, 8.975f)
                lineTo(12.5359f, 10.0244f)
                curveTo(13.4049f, 9.1369f, 14.2295f, 9.0337f, 14.7467f, 9.227f)
                curveTo(15.2555f, 9.4173f, 15.75f, 10.0006f, 15.75f, 11.1083f)
                horizontalLineTo(17.25f)
                close()
                moveTo(9.5426f, 15.5129f)
                curveTo(10.3221f, 16.176f, 10.9428f, 16.743f, 12.0f, 16.743f)
                lineTo(12.0f, 15.243f)
                curveTo(11.586f, 15.243f, 11.3828f, 15.109f, 10.5145f, 14.3704f)
                lineTo(9.5426f, 15.5129f)
                close()
                moveTo(13.4855f, 14.3704f)
                curveTo(12.6172f, 15.109f, 12.414f, 15.243f, 12.0f, 15.243f)
                lineTo(12.0f, 16.743f)
                curveTo(13.0572f, 16.743f, 13.6779f, 16.176f, 14.4574f, 15.5129f)
                lineTo(13.4855f, 14.3704f)
                close()
            }
        }
        .build()
        return _chatRoundLike!!
    }

private var _chatRoundLike: ImageVector? = null
