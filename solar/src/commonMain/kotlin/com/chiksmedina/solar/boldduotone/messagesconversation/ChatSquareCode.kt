package com.chiksmedina.solar.boldduotone.messagesconversation

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
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.ChatSquareCode: ImageVector
    get() {
        if (_chatSquareCode != null) {
            return _chatSquareCode!!
        }
        _chatSquareCode = Builder(
            name = "ChatSquareCode", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.7916f, 21.319f)
                lineTo(13.1953f, 22.3265f)
                curveTo(12.6638f, 23.2244f, 11.3361f, 23.2244f, 10.8046f, 22.3265f)
                lineTo(10.2083f, 21.319f)
                curveTo(9.7458f, 20.5376f, 9.5145f, 20.1469f, 9.1431f, 19.9308f)
                curveTo(8.7716f, 19.7148f, 8.3039f, 19.7067f, 7.3685f, 19.6906f)
                curveTo(5.9876f, 19.6668f, 5.1216f, 19.5822f, 4.3952f, 19.2813f)
                curveTo(3.0476f, 18.7231f, 1.9769f, 17.6524f, 1.4187f, 16.3048f)
                curveTo(1.0f, 15.294f, 1.0f, 14.0127f, 1.0f, 11.45f)
                verticalLineTo(10.35f)
                curveTo(1.0f, 6.7492f, 1.0f, 4.9488f, 1.8105f, 3.6263f)
                curveTo(2.264f, 2.8862f, 2.8862f, 2.264f, 3.6263f, 1.8105f)
                curveTo(4.9488f, 1.0f, 6.7492f, 1.0f, 10.35f, 1.0f)
                horizontalLineTo(13.65f)
                curveTo(17.2508f, 1.0f, 19.0512f, 1.0f, 20.3737f, 1.8105f)
                curveTo(21.1138f, 2.264f, 21.736f, 2.8862f, 22.1895f, 3.6263f)
                curveTo(23.0f, 4.9488f, 23.0f, 6.7492f, 23.0f, 10.35f)
                verticalLineTo(11.45f)
                curveTo(23.0f, 14.0127f, 23.0f, 15.294f, 22.5813f, 16.3048f)
                curveTo(22.0231f, 17.6524f, 20.9524f, 18.7231f, 19.6048f, 19.2813f)
                curveTo(18.8784f, 19.5822f, 18.0123f, 19.6668f, 16.6314f, 19.6906f)
                curveTo(15.696f, 19.7067f, 15.2284f, 19.7148f, 14.8569f, 19.9308f)
                curveTo(14.4854f, 20.1469f, 14.2542f, 20.5376f, 13.7916f, 21.319f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.2665f, 6.8295f)
                curveTo(15.5887f, 6.5073f, 16.1111f, 6.5073f, 16.4333f, 6.8295f)
                lineTo(16.622f, 7.0183f)
                curveTo(16.6355f, 7.0318f, 16.649f, 7.0453f, 16.6624f, 7.0587f)
                curveTo(17.3613f, 7.7575f, 17.9441f, 8.3403f, 18.3445f, 8.8651f)
                curveTo(18.7672f, 9.4191f, 19.0636f, 10.0043f, 19.0636f, 10.7129f)
                curveTo(19.0636f, 11.4214f, 18.7672f, 12.0067f, 18.3445f, 12.5607f)
                curveTo(17.9441f, 13.0855f, 17.3613f, 13.6683f, 16.6624f, 14.3671f)
                lineTo(16.4333f, 14.5963f)
                curveTo(16.1111f, 14.9184f, 15.5887f, 14.9184f, 15.2665f, 14.5963f)
                curveTo(14.9444f, 14.2741f, 14.9444f, 13.7517f, 15.2665f, 13.4295f)
                lineTo(15.4553f, 13.2408f)
                curveTo(16.2051f, 12.491f, 16.7075f, 11.9861f, 17.0327f, 11.5598f)
                curveTo(17.3434f, 11.1526f, 17.4136f, 10.9156f, 17.4136f, 10.7129f)
                curveTo(17.4136f, 10.5102f, 17.3434f, 10.2731f, 17.0327f, 9.866f)
                curveTo(16.7075f, 9.4397f, 16.2051f, 8.9348f, 15.4553f, 8.185f)
                lineTo(15.2665f, 7.9963f)
                curveTo(14.9444f, 7.6741f, 14.9444f, 7.1517f, 15.2665f, 6.8295f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.637f, 4.6032f)
                curveTo(14.0771f, 4.7211f, 14.3383f, 5.1735f, 14.2203f, 5.6136f)
                lineTo(11.3733f, 16.2388f)
                curveTo(11.2554f, 16.6789f, 10.803f, 16.9401f, 10.3629f, 16.8221f)
                curveTo(9.9228f, 16.7042f, 9.6616f, 16.2518f, 9.7795f, 15.8117f)
                lineTo(12.6266f, 5.1865f)
                curveTo(12.7445f, 4.7464f, 13.1969f, 4.4852f, 13.637f, 4.6032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.7335f, 6.8295f)
                curveTo(8.4113f, 6.5073f, 7.8889f, 6.5073f, 7.5667f, 6.8295f)
                lineTo(7.378f, 7.0183f)
                curveTo(7.3645f, 7.0318f, 7.351f, 7.0453f, 7.3376f, 7.0587f)
                curveTo(6.6387f, 7.7575f, 6.0559f, 8.3403f, 5.6555f, 8.8651f)
                curveTo(5.2328f, 9.4191f, 4.9364f, 10.0043f, 4.9364f, 10.7129f)
                curveTo(4.9364f, 11.4214f, 5.2328f, 12.0067f, 5.6555f, 12.5607f)
                curveTo(6.0559f, 13.0855f, 6.6387f, 13.6683f, 7.3376f, 14.3671f)
                lineTo(7.5667f, 14.5963f)
                curveTo(7.8889f, 14.9184f, 8.4113f, 14.9184f, 8.7335f, 14.5963f)
                curveTo(9.0556f, 14.2741f, 9.0556f, 13.7517f, 8.7335f, 13.4295f)
                lineTo(8.5447f, 13.2408f)
                curveTo(7.7949f, 12.491f, 7.2925f, 11.9861f, 6.9673f, 11.5598f)
                curveTo(6.6566f, 11.1526f, 6.5864f, 10.9156f, 6.5864f, 10.7129f)
                curveTo(6.5864f, 10.5102f, 6.6566f, 10.2731f, 6.9673f, 9.866f)
                curveTo(7.2925f, 9.4397f, 7.7949f, 8.9348f, 8.5447f, 8.185f)
                lineTo(8.7335f, 7.9963f)
                curveTo(9.0556f, 7.6741f, 9.0556f, 7.1517f, 8.7335f, 6.8295f)
                close()
            }
        }
            .build()
        return _chatSquareCode!!
    }

private var _chatSquareCode: ImageVector? = null
