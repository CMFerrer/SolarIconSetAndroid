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

val VideoAudioSoundGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(
            name = "CameraRotate", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                curveTo(17.0329f, 5.0109f, 17.0439f, 5.0111f, 17.0548f, 5.0116f)
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
                curveTo(6.9562f, 5.0111f, 6.9671f, 5.0109f, 6.978f, 5.0109f)
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
                moveTo(14.5197f, 8.25f)
                curveTo(14.9339f, 8.25f, 15.2697f, 8.5858f, 15.2697f, 9.0f)
                verticalLineTo(10.6799f)
                curveTo(15.2697f, 11.0346f, 15.0213f, 11.3408f, 14.6742f, 11.4138f)
                lineTo(13.1545f, 11.7339f)
                curveTo(12.7492f, 11.8193f, 12.3514f, 11.5599f, 12.2661f, 11.1546f)
                curveTo(12.1928f, 10.8065f, 12.3737f, 10.4641f, 12.6828f, 10.3202f)
                curveTo(11.8617f, 10.0792f, 10.9379f, 10.2825f, 10.2902f, 10.9303f)
                curveTo(9.346f, 11.8745f, 9.346f, 13.4053f, 10.2902f, 14.3495f)
                curveTo(11.2343f, 15.2937f, 12.7652f, 15.2937f, 13.7094f, 14.3495f)
                curveTo(14.112f, 13.9469f, 14.3422f, 13.4396f, 14.4019f, 12.9152f)
                curveTo(14.4487f, 12.5037f, 14.8203f, 12.208f, 15.2319f, 12.2548f)
                curveTo(15.6434f, 12.3016f, 15.9391f, 12.6732f, 15.8923f, 13.0848f)
                curveTo(15.7957f, 13.9341f, 15.421f, 14.7592f, 14.77f, 15.4101f)
                curveTo(13.24f, 16.9401f, 10.7595f, 16.9401f, 9.2295f, 15.4101f)
                curveTo(7.6995f, 13.8802f, 7.6995f, 11.3996f, 9.2295f, 9.8696f)
                curveTo(10.4581f, 8.6411f, 12.2996f, 8.399f, 13.7697f, 9.1435f)
                verticalLineTo(9.0f)
                curveTo(13.7697f, 8.5858f, 14.1055f, 8.25f, 14.5197f, 8.25f)
                close()
            }
        }
            .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
