package com.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.VideoFrameCut: ImageVector
    get() {
        if (_videoFrameCut != null) {
            return _videoFrameCut!!
        }
        _videoFrameCut = Builder(
            name = "VideoFrameCut", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(3.6667f)
                curveTo(12.75f, 4.0809f, 12.4142f, 4.4167f, 12.0f, 4.4167f)
                curveTo(11.5858f, 4.4167f, 11.25f, 4.0809f, 11.25f, 3.6667f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(12.0f, 6.25f)
                curveTo(12.4142f, 6.25f, 12.75f, 6.5858f, 12.75f, 7.0f)
                verticalLineTo(10.3333f)
                curveTo(12.75f, 10.7475f, 12.4142f, 11.0833f, 12.0f, 11.0833f)
                curveTo(11.5858f, 11.0833f, 11.25f, 10.7475f, 11.25f, 10.3333f)
                verticalLineTo(7.0f)
                curveTo(11.25f, 6.5858f, 11.5858f, 6.25f, 12.0f, 6.25f)
                close()
                moveTo(12.0f, 12.9167f)
                curveTo(12.4142f, 12.9167f, 12.75f, 13.2525f, 12.75f, 13.6667f)
                verticalLineTo(17.0f)
                curveTo(12.75f, 17.4142f, 12.4142f, 17.75f, 12.0f, 17.75f)
                curveTo(11.5858f, 17.75f, 11.25f, 17.4142f, 11.25f, 17.0f)
                verticalLineTo(13.6667f)
                curveTo(11.25f, 13.2525f, 11.5858f, 12.9167f, 12.0f, 12.9167f)
                close()
                moveTo(12.0f, 19.5833f)
                curveTo(12.4142f, 19.5833f, 12.75f, 19.9191f, 12.75f, 20.3333f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.3333f)
                curveTo(11.25f, 19.9191f, 11.5858f, 19.5833f, 12.0f, 19.5833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2499f, 2.9979f)
                curveTo(10.2529f, 3.4121f, 9.9196f, 3.7503f, 9.5054f, 3.7534f)
                curveTo(8.8268f, 3.7583f, 8.2382f, 3.7707f, 7.7228f, 3.7992f)
                curveTo(7.7405f, 3.8631f, 7.75f, 3.9304f, 7.75f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(7.75f, 20.0696f, 7.7405f, 20.1369f, 7.7228f, 20.2008f)
                curveTo(8.2382f, 20.2293f, 8.8268f, 20.2417f, 9.5054f, 20.2466f)
                curveTo(9.9196f, 20.2497f, 10.2529f, 20.5879f, 10.2499f, 21.0021f)
                curveTo(10.2469f, 21.4163f, 9.9086f, 21.7496f, 9.4944f, 21.7466f)
                curveTo(8.1014f, 21.7364f, 6.9568f, 21.6966f, 6.024f, 21.5183f)
                curveTo(5.07f, 21.3359f, 4.2813f, 20.9989f, 3.6412f, 20.3588f)
                curveTo(2.8929f, 19.6104f, 2.5608f, 18.6614f, 2.4031f, 17.489f)
                curveTo(2.25f, 16.3498f, 2.25f, 14.8942f, 2.25f, 13.0564f)
                verticalLineTo(10.9436f)
                curveTo(2.25f, 9.1058f, 2.25f, 7.6502f, 2.4031f, 6.511f)
                curveTo(2.5608f, 5.3386f, 2.8929f, 4.3896f, 3.6412f, 3.6412f)
                curveTo(4.2813f, 3.0011f, 5.07f, 2.6641f, 6.024f, 2.4817f)
                curveTo(6.9568f, 2.3033f, 8.1014f, 2.2636f, 9.4944f, 2.2534f)
                curveTo(9.9086f, 2.2504f, 10.2469f, 2.5837f, 10.2499f, 2.9979f)
                close()
                moveTo(6.2508f, 20.0342f)
                curveTo(6.2503f, 20.0229f, 6.25f, 20.0115f, 6.25f, 20.0f)
                verticalLineTo(16.25f)
                horizontalLineTo(3.7976f)
                curveTo(3.8181f, 16.6311f, 3.8476f, 16.9754f, 3.8898f, 17.2892f)
                curveTo(4.025f, 18.2952f, 4.2787f, 18.8749f, 4.7019f, 19.2981f)
                curveTo(5.0577f, 19.6538f, 5.5219f, 19.888f, 6.2508f, 20.0342f)
                close()
                moveTo(3.7557f, 14.75f)
                horizontalLineTo(6.25f)
                verticalLineTo(9.25f)
                horizontalLineTo(3.7557f)
                curveTo(3.7502f, 9.7762f, 3.75f, 10.3567f, 3.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.75f, 13.6433f, 3.7502f, 14.2237f, 3.7557f, 14.75f)
                close()
                moveTo(3.7976f, 7.75f)
                horizontalLineTo(6.25f)
                verticalLineTo(4.0f)
                curveTo(6.25f, 3.9885f, 6.2503f, 3.9771f, 6.2508f, 3.9658f)
                curveTo(5.5219f, 4.112f, 5.0577f, 4.3462f, 4.7019f, 4.7019f)
                curveTo(4.2787f, 5.1251f, 4.025f, 5.7048f, 3.8898f, 6.7108f)
                curveTo(3.8476f, 7.0246f, 3.8181f, 7.3689f, 3.7976f, 7.75f)
                close()
                moveTo(13.75f, 2.9979f)
                curveTo(13.753f, 2.5837f, 14.0913f, 2.2504f, 14.5055f, 2.2534f)
                curveTo(15.8985f, 2.2636f, 17.0432f, 2.3033f, 17.976f, 2.4817f)
                curveTo(18.93f, 2.6641f, 19.7186f, 3.0011f, 20.3588f, 3.6412f)
                curveTo(21.1071f, 4.3896f, 21.4392f, 5.3386f, 21.5969f, 6.511f)
                curveTo(21.75f, 7.6502f, 21.75f, 9.1058f, 21.75f, 10.9436f)
                verticalLineTo(13.0564f)
                curveTo(21.75f, 14.8942f, 21.75f, 16.3498f, 21.5969f, 17.489f)
                curveTo(21.4392f, 18.6614f, 21.1071f, 19.6104f, 20.3588f, 20.3588f)
                curveTo(19.7186f, 20.9989f, 18.93f, 21.3359f, 17.976f, 21.5183f)
                curveTo(17.0432f, 21.6967f, 15.8985f, 21.7364f, 14.5055f, 21.7466f)
                curveTo(14.0913f, 21.7496f, 13.753f, 21.4163f, 13.75f, 21.0021f)
                curveTo(13.747f, 20.5879f, 14.0803f, 20.2497f, 14.4945f, 20.2466f)
                curveTo(15.1732f, 20.2417f, 15.7618f, 20.2293f, 16.2772f, 20.2008f)
                curveTo(16.2595f, 20.1369f, 16.25f, 20.0696f, 16.25f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(16.25f, 3.9304f, 16.2595f, 3.8631f, 16.2772f, 3.7992f)
                curveTo(15.7618f, 3.7707f, 15.1732f, 3.7583f, 14.4945f, 3.7534f)
                curveTo(14.0803f, 3.7503f, 13.747f, 3.4121f, 13.75f, 2.9979f)
                close()
                moveTo(17.7492f, 3.9658f)
                curveTo(17.7497f, 3.9771f, 17.75f, 3.9885f, 17.75f, 4.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(20.2024f)
                curveTo(20.1819f, 7.3689f, 20.1524f, 7.0246f, 20.1102f, 6.7108f)
                curveTo(19.975f, 5.7048f, 19.7213f, 5.1251f, 19.2981f, 4.7019f)
                curveTo(18.9424f, 4.3462f, 18.4781f, 4.112f, 17.7492f, 3.9658f)
                close()
                moveTo(20.2443f, 9.25f)
                horizontalLineTo(17.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(20.2443f)
                curveTo(20.2498f, 14.2237f, 20.25f, 13.6433f, 20.25f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(20.25f, 10.3567f, 20.2498f, 9.7762f, 20.2443f, 9.25f)
                close()
                moveTo(20.2024f, 16.25f)
                horizontalLineTo(17.75f)
                verticalLineTo(20.0f)
                curveTo(17.75f, 20.0115f, 17.7497f, 20.0229f, 17.7492f, 20.0342f)
                curveTo(18.4781f, 19.888f, 18.9424f, 19.6538f, 19.2981f, 19.2981f)
                curveTo(19.7213f, 18.8749f, 19.975f, 18.2952f, 20.1102f, 17.2892f)
                curveTo(20.1524f, 16.9754f, 20.1819f, 16.6311f, 20.2024f, 16.25f)
                close()
            }
        }
            .build()
        return _videoFrameCut!!
    }

private var _videoFrameCut: ImageVector? = null
