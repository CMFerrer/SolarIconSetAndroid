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

val MessagesConversationGroup.SquareShareLine: ImageVector
    get() {
        if (_squareShareLine != null) {
            return _squareShareLine!!
        }
        _squareShareLine = Builder(
            name = "SquareShareLine", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.7521f, 1.9936f)
                curveTo(10.7556f, 2.4078f, 10.4226f, 2.7465f, 10.0084f, 2.75f)
                curveTo(8.2988f, 2.7645f, 7.0389f, 2.8201f, 6.0628f, 3.0113f)
                curveTo(5.1077f, 3.1983f, 4.4798f, 3.5053f, 3.9952f, 3.99f)
                curveTo(3.4253f, 4.5598f, 3.0983f, 5.3308f, 2.9264f, 6.6095f)
                curveTo(2.7516f, 7.9099f, 2.75f, 9.6186f, 2.75f, 11.9974f)
                curveTo(2.75f, 14.3762f, 2.7516f, 16.0849f, 2.9264f, 17.3852f)
                curveTo(3.0983f, 18.664f, 3.4253f, 19.435f, 3.9952f, 20.0048f)
                curveTo(4.565f, 20.5747f, 5.336f, 20.9017f, 6.6148f, 21.0736f)
                curveTo(7.9151f, 21.2484f, 9.6238f, 21.25f, 12.0026f, 21.25f)
                curveTo(14.3814f, 21.25f, 16.0901f, 21.2484f, 17.3905f, 21.0736f)
                curveTo(18.6692f, 20.9017f, 19.4402f, 20.5747f, 20.01f, 20.0048f)
                curveTo(20.4947f, 19.5202f, 20.8017f, 18.8923f, 20.9887f, 17.9372f)
                curveTo(21.1799f, 16.9611f, 21.2355f, 15.7012f, 21.25f, 13.9916f)
                curveTo(21.2535f, 13.5774f, 21.5922f, 13.2444f, 22.0064f, 13.2479f)
                curveTo(22.4206f, 13.2515f, 22.7535f, 13.5901f, 22.75f, 14.0043f)
                curveTo(22.7355f, 15.7087f, 22.6819f, 17.0968f, 22.4608f, 18.2255f)
                curveTo(22.2356f, 19.3752f, 21.8272f, 20.309f, 21.0707f, 21.0655f)
                curveTo(20.1757f, 21.9605f, 19.0354f, 22.3659f, 17.5903f, 22.5602f)
                curveTo(16.1785f, 22.75f, 14.369f, 22.75f, 12.06f, 22.75f)
                horizontalLineTo(11.9452f)
                curveTo(9.6362f, 22.75f, 7.8267f, 22.75f, 6.4149f, 22.5602f)
                curveTo(4.9698f, 22.3659f, 3.8295f, 21.9605f, 2.9345f, 21.0655f)
                curveTo(2.0395f, 20.1705f, 1.6341f, 19.0302f, 1.4398f, 17.5851f)
                curveTo(1.25f, 16.1733f, 1.25f, 14.3638f, 1.25f, 12.0548f)
                verticalLineTo(11.94f)
                curveTo(1.25f, 9.631f, 1.25f, 7.8215f, 1.4398f, 6.4097f)
                curveTo(1.6341f, 4.9646f, 2.0395f, 3.8243f, 2.9345f, 2.9293f)
                curveTo(3.691f, 2.1728f, 4.6248f, 1.7644f, 5.7745f, 1.5392f)
                curveTo(6.9032f, 1.3181f, 8.2913f, 1.2645f, 9.9957f, 1.25f)
                curveTo(10.4099f, 1.2465f, 10.7485f, 1.5794f, 10.7521f, 1.9936f)
                close()
                moveTo(16.4697f, 1.4697f)
                curveTo(16.7626f, 1.1768f, 17.2374f, 1.1768f, 17.5303f, 1.4697f)
                lineTo(22.5303f, 6.4697f)
                curveTo(22.8232f, 6.7626f, 22.8232f, 7.2374f, 22.5303f, 7.5303f)
                lineTo(17.5303f, 12.5303f)
                curveTo(17.2374f, 12.8232f, 16.7626f, 12.8232f, 16.4697f, 12.5303f)
                curveTo(16.1768f, 12.2374f, 16.1768f, 11.7626f, 16.4697f, 11.4697f)
                lineTo(20.1893f, 7.75f)
                horizontalLineTo(14.0f)
                curveTo(12.4485f, 7.75f, 11.5328f, 8.507f, 11.212f, 8.8293f)
                lineTo(11.0199f, 9.0224f)
                lineTo(10.8293f, 9.212f)
                curveTo(10.507f, 9.5328f, 9.75f, 10.4485f, 9.75f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(9.75f, 15.4142f, 9.4142f, 15.75f, 9.0f, 15.75f)
                curveTo(8.5858f, 15.75f, 8.25f, 15.4142f, 8.25f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(8.25f, 9.9162f, 9.277f, 8.6406f, 9.7712f, 8.1488f)
                curveTo(9.7712f, 8.1488f, 9.7712f, 8.1488f, 9.7712f, 8.1488f)
                lineTo(9.9618f, 7.9592f)
                lineTo(10.1488f, 7.7712f)
                curveTo(10.6406f, 7.277f, 11.9162f, 6.25f, 14.0f, 6.25f)
                horizontalLineTo(20.1893f)
                lineTo(16.4697f, 2.5303f)
                curveTo(16.1768f, 2.2374f, 16.1768f, 1.7626f, 16.4697f, 1.4697f)
                close()
            }
        }
            .build()
        return _squareShareLine!!
    }

private var _squareShareLine: ImageVector? = null
