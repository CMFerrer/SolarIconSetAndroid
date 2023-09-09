package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.ChatRoundCall: ImageVector
    get() {
        if (_chatRoundCall != null) {
            return _chatRoundCall!!
        }
        _chatRoundCall = Builder(name = "ChatRoundCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
                    pathFillType = EvenOdd) {
                moveTo(11.9999f, 6.7754f)
                curveTo(11.5443f, 6.7754f, 11.1749f, 7.1448f, 11.1749f, 7.6004f)
                verticalLineTo(16.4004f)
                curveTo(11.1749f, 16.856f, 11.5443f, 17.2254f, 11.9999f, 17.2254f)
                curveTo(12.4555f, 17.2254f, 12.8249f, 16.856f, 12.8249f, 16.4004f)
                verticalLineTo(7.6004f)
                curveTo(12.8249f, 7.1448f, 12.4555f, 6.7754f, 11.9999f, 6.7754f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5999f, 8.9754f)
                curveTo(7.1443f, 8.9754f, 6.7749f, 9.3448f, 6.7749f, 9.8004f)
                verticalLineTo(14.2004f)
                curveTo(6.7749f, 14.656f, 7.1443f, 15.0254f, 7.5999f, 15.0254f)
                curveTo(8.0555f, 15.0254f, 8.4249f, 14.656f, 8.4249f, 14.2004f)
                verticalLineTo(9.8004f)
                curveTo(8.4249f, 9.3448f, 8.0555f, 8.9754f, 7.5999f, 8.9754f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5749f, 9.8004f)
                curveTo(15.5749f, 9.3448f, 15.9443f, 8.9754f, 16.3999f, 8.9754f)
                curveTo(16.8555f, 8.9754f, 17.2249f, 9.3448f, 17.2249f, 9.8004f)
                verticalLineTo(14.2004f)
                curveTo(17.2249f, 14.656f, 16.8555f, 15.0254f, 16.3999f, 15.0254f)
                curveTo(15.9443f, 15.0254f, 15.5749f, 14.656f, 15.5749f, 14.2004f)
                verticalLineTo(9.8004f)
                close()
            }
        }
        .build()
        return _chatRoundCall!!
    }

private var _chatRoundCall: ImageVector? = null
