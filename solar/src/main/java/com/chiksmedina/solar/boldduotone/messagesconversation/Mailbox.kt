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

public val MessagesConversationGroup.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.25f)
                curveTo(2.0f, 8.3505f, 4.0147f, 6.0f, 6.5f, 6.0f)
                curveTo(8.9853f, 6.0f, 11.0f, 8.3505f, 11.0f, 11.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.2326f)
                curveTo(2.9996f, 20.0f, 2.0f, 18.8339f, 2.0f, 17.3953f)
                verticalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.8f, strokeAlpha
                    = 0.8f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 11.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(15.0f)
                horizontalLineTo(19.7931f)
                curveTo(21.0119f, 20.0f, 22.0f, 18.8473f, 22.0f, 17.4253f)
                verticalLineTo(11.25f)
                curveTo(22.0f, 8.3505f, 19.9853f, 6.0f, 17.5f, 6.0f)
                horizontalLineTo(6.5f)
                curveTo(8.9853f, 6.0f, 11.0f, 8.3505f, 11.0f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(9.5f, 22.4142f, 9.8358f, 22.75f, 10.25f, 22.75f)
                curveTo(10.6642f, 22.75f, 11.0f, 22.4142f, 11.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(22.0f)
                curveTo(13.5f, 22.4142f, 13.8358f, 22.75f, 14.25f, 22.75f)
                curveTo(14.6642f, 22.75f, 15.0f, 22.4142f, 15.0f, 22.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 16.0f)
                curveTo(4.25f, 15.5858f, 4.5858f, 15.25f, 5.0f, 15.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 15.25f, 8.75f, 15.5858f, 8.75f, 16.0f)
                curveTo(8.75f, 16.4142f, 8.4142f, 16.75f, 8.0f, 16.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 16.75f, 4.25f, 16.4142f, 4.25f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.3846f, 6.5847f)
                lineTo(17.6407f, 6.5334f)
                curveTo(18.0564f, 6.4502f, 18.4863f, 6.49f, 18.8814f, 6.6481f)
                curveTo(19.5717f, 6.9245f, 20.3266f, 6.9762f, 21.0458f, 6.7962f)
                lineTo(21.1073f, 6.7808f)
                curveTo(21.6309f, 6.6498f, 22.0f, 6.163f, 22.0f, 5.6034f)
                verticalLineTo(3.4728f)
                curveTo(22.0f, 2.735f, 21.3358f, 2.1915f, 20.6454f, 2.3642f)
                curveTo(20.249f, 2.4634f, 19.8329f, 2.435f, 19.4523f, 2.2826f)
                lineTo(19.3793f, 2.2534f)
                curveTo(18.7422f, 1.9983f, 18.0491f, 1.9342f, 17.3787f, 2.0684f)
                lineTo(16.93f, 2.1582f)
                curveTo(16.3901f, 2.2663f, 16.0f, 2.7572f, 16.0f, 3.3285f)
                verticalLineTo(10.2807f)
                curveTo(16.0f, 10.678f, 16.31f, 11.0f, 16.6923f, 11.0f)
                curveTo(17.0747f, 11.0f, 17.3846f, 10.678f, 17.3846f, 10.2807f)
                verticalLineTo(6.5847f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
