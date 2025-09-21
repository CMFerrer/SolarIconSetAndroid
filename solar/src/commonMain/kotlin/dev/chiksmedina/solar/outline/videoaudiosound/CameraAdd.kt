package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.CameraAdd: ImageVector
    get() {
        if (_cameraAdd != null) {
            return _cameraAdd!!
        }
        _cameraAdd = Builder(
            name = "CameraAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5984f, 4.4867f)
                curveTo(7.8653f, 3.1768f, 9.0309f, 2.25f, 10.3663f, 2.25f)
                horizontalLineTo(13.6337f)
                curveTo(14.9691f, 2.25f, 16.1347f, 3.1768f, 16.4016f, 4.4867f)
                curveTo(16.4632f, 4.789f, 16.7371f, 5.0109f, 17.022f, 5.0109f)
                horizontalLineTo(17.0384f)
                lineTo(17.0548f, 5.0116f)
                curveTo(18.4582f, 5.0729f, 19.5362f, 5.2452f, 20.4362f, 5.8356f)
                curveTo(21.0032f, 6.2076f, 21.4909f, 6.6862f, 21.871f, 7.2446f)
                curveTo(22.3439f, 7.9395f, 22.5524f, 8.7369f, 22.6524f, 9.7015f)
                curveTo(22.75f, 10.6438f, 22.75f, 11.825f, 22.75f, 13.3211f)
                verticalLineTo(13.4062f)
                curveTo(22.75f, 14.9023f, 22.75f, 16.0835f, 22.6524f, 17.0258f)
                curveTo(22.5524f, 17.9903f, 22.3439f, 18.7878f, 21.871f, 19.4826f)
                curveTo(21.4909f, 20.0411f, 21.0032f, 20.5197f, 20.4362f, 20.8917f)
                curveTo(19.7327f, 21.3532f, 18.9262f, 21.5567f, 17.948f, 21.6544f)
                curveTo(16.9903f, 21.75f, 15.789f, 21.75f, 14.2634f, 21.75f)
                horizontalLineTo(9.7366f)
                curveTo(8.211f, 21.75f, 7.0097f, 21.75f, 6.052f, 21.6544f)
                curveTo(5.0738f, 21.5567f, 4.2673f, 21.3532f, 3.5638f, 20.8917f)
                curveTo(2.9968f, 20.5197f, 2.509f, 20.0411f, 2.129f, 19.4826f)
                curveTo(1.6561f, 18.7878f, 1.4476f, 17.9903f, 1.3476f, 17.0258f)
                curveTo(1.25f, 16.0835f, 1.25f, 14.9023f, 1.25f, 13.4062f)
                verticalLineTo(13.3211f)
                curveTo(1.25f, 11.825f, 1.25f, 10.6438f, 1.3476f, 9.7015f)
                curveTo(1.4476f, 8.7369f, 1.6561f, 7.9395f, 2.129f, 7.2446f)
                curveTo(2.509f, 6.6862f, 2.9968f, 6.2076f, 3.5638f, 5.8356f)
                curveTo(4.4638f, 5.2452f, 5.5418f, 5.0729f, 6.9452f, 5.0116f)
                lineTo(6.9616f, 5.0109f)
                horizontalLineTo(6.978f)
                curveTo(7.2629f, 5.0109f, 7.5368f, 4.7891f, 7.5984f, 4.4867f)
                close()
                moveTo(10.3663f, 3.75f)
                curveTo(9.7252f, 3.75f, 9.189f, 4.193f, 9.0682f, 4.7861f)
                curveTo(8.8726f, 5.7466f, 8.021f, 6.5019f, 6.9963f, 6.5108f)
                curveTo(5.6477f, 6.5707f, 4.9254f, 6.7364f, 4.3866f, 7.0898f)
                curveTo(3.9831f, 7.3545f, 3.6375f, 7.6941f, 3.3691f, 8.0886f)
                curveTo(3.0929f, 8.4944f, 2.927f, 9.0133f, 2.8396f, 9.856f)
                curveTo(2.7509f, 10.7121f, 2.75f, 11.8156f, 2.75f, 13.3636f)
                curveTo(2.75f, 14.9117f, 2.7509f, 16.0152f, 2.8396f, 16.8712f)
                curveTo(2.927f, 17.714f, 3.0929f, 18.2329f, 3.3691f, 18.6387f)
                curveTo(3.6375f, 19.0332f, 3.9831f, 19.3728f, 4.3866f, 19.6375f)
                curveTo(4.8042f, 19.9114f, 5.3384f, 20.0756f, 6.201f, 20.1618f)
                curveTo(7.0755f, 20.2491f, 8.2019f, 20.25f, 9.7778f, 20.25f)
                horizontalLineTo(14.2222f)
                curveTo(15.7981f, 20.25f, 16.9245f, 20.2491f, 17.799f, 20.1618f)
                curveTo(18.6616f, 20.0756f, 19.1958f, 19.9114f, 19.6134f, 19.6375f)
                curveTo(20.0169f, 19.3728f, 20.3625f, 19.0332f, 20.6309f, 18.6387f)
                curveTo(20.9071f, 18.2329f, 21.073f, 17.714f, 21.1604f, 16.8712f)
                curveTo(21.2491f, 16.0152f, 21.25f, 14.9117f, 21.25f, 13.3636f)
                curveTo(21.25f, 11.8156f, 21.2491f, 10.7121f, 21.1604f, 9.856f)
                curveTo(21.073f, 9.0133f, 20.9071f, 8.4944f, 20.6309f, 8.0886f)
                curveTo(20.3625f, 7.6941f, 20.0169f, 7.3545f, 19.6134f, 7.0898f)
                curveTo(19.0746f, 6.7364f, 18.3523f, 6.5707f, 17.0037f, 6.5108f)
                curveTo(15.979f, 6.5019f, 15.1274f, 5.7466f, 14.9318f, 4.7861f)
                curveTo(14.8109f, 4.193f, 14.2748f, 3.75f, 13.6337f, 3.75f)
                horizontalLineTo(10.3663f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 12.25f, 15.75f, 12.5858f, 15.75f, 13.0f)
                curveTo(15.75f, 13.4142f, 15.4142f, 13.75f, 15.0f, 13.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(13.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 13.75f, 8.25f, 13.4142f, 8.25f, 13.0f)
                curveTo(8.25f, 12.5858f, 8.5858f, 12.25f, 9.0f, 12.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(17.25f, 10.0f)
                curveTo(17.25f, 9.5858f, 17.5858f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 9.25f, 19.75f, 9.5858f, 19.75f, 10.0f)
                curveTo(19.75f, 10.4142f, 19.4142f, 10.75f, 19.0f, 10.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 10.75f, 17.25f, 10.4142f, 17.25f, 10.0f)
                close()
            }
        }
            .build()
        return _cameraAdd!!
    }

private var _cameraAdd: ImageVector? = null
