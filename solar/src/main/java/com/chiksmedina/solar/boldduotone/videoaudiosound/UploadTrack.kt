package com.chiksmedina.solar.boldduotone.videoaudiosound

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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.UploadTrack: ImageVector
    get() {
        if (_uploadTrack != null) {
            return _uploadTrack!!
        }
        _uploadTrack = Builder(
            name = "UploadTrack", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(13.3261f, 22.0f, 14.592f, 21.7419f, 15.75f, 21.2731f)
                verticalLineTo(19.7362f)
                curveTo(15.094f, 19.8091f, 14.412f, 19.594f, 13.909f, 19.091f)
                curveTo(13.0303f, 18.2123f, 13.0303f, 16.7877f, 13.909f, 15.909f)
                lineTo(16.409f, 13.409f)
                curveTo(17.2877f, 12.5303f, 18.7123f, 12.5303f, 19.591f, 13.409f)
                lineTo(21.4528f, 15.2709f)
                curveTo(21.8074f, 14.246f, 22.0f, 13.1455f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.4697f, 14.4697f)
                curveTo(17.7626f, 14.1768f, 18.2374f, 14.1768f, 18.5303f, 14.4697f)
                lineTo(21.0303f, 16.9697f)
                curveTo(21.3232f, 17.2626f, 21.3232f, 17.7374f, 21.0303f, 18.0303f)
                curveTo(20.7374f, 18.3232f, 20.2626f, 18.3232f, 19.9697f, 18.0303f)
                lineTo(18.75f, 16.8107f)
                verticalLineTo(22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                curveTo(17.5858f, 22.75f, 17.25f, 22.4142f, 17.25f, 22.0f)
                verticalLineTo(16.8107f)
                lineTo(16.0303f, 18.0303f)
                curveTo(15.7374f, 18.3232f, 15.2626f, 18.3232f, 14.9697f, 18.0303f)
                curveTo(14.6768f, 17.7374f, 14.6768f, 17.2626f, 14.9697f, 16.9697f)
                lineTo(17.4697f, 14.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 11.2137f)
                lineTo(13.7397f, 11.7086f)
                curveTo(13.9425f, 11.81f, 14.1204f, 11.8989f, 14.269f, 11.9637f)
                curveTo(14.4199f, 12.0295f, 14.5988f, 12.0972f, 14.7972f, 12.1204f)
                curveTo(15.6037f, 12.2145f, 16.3689f, 11.7415f, 16.6454f, 10.9782f)
                curveTo(16.7134f, 10.7904f, 16.7328f, 10.6f, 16.7415f, 10.4357f)
                curveTo(16.75f, 10.2737f, 16.75f, 10.0749f, 16.75f, 9.8481f)
                lineTo(16.75f, 9.7886f)
                curveTo(16.7503f, 9.6267f, 16.7505f, 9.455f, 16.7188f, 9.2893f)
                curveTo(16.638f, 8.867f, 16.4045f, 8.4892f, 16.0629f, 8.228f)
                curveTo(15.9289f, 8.1256f, 15.7752f, 8.049f, 15.6303f, 7.9768f)
                lineTo(14.2603f, 7.2919f)
                curveTo(14.0575f, 7.1904f, 13.8796f, 7.1015f, 13.731f, 7.0367f)
                curveTo(13.5801f, 6.9709f, 13.4012f, 6.9032f, 13.2028f, 6.88f)
                curveTo(12.3963f, 6.786f, 11.6311f, 7.2589f, 11.3546f, 8.0223f)
                curveTo(11.2866f, 8.2101f, 11.2672f, 8.4004f, 11.2585f, 8.5647f)
                curveTo(11.2519f, 8.6894f, 11.2504f, 8.8359f, 11.2501f, 9.0002f)
                lineTo(11.25f, 9.2123f)
                curveTo(11.2499f, 9.2396f, 11.2499f, 9.2675f, 11.25f, 9.2953f)
                verticalLineTo(12.5501f)
                curveTo(10.875f, 12.3584f, 10.4501f, 12.2502f, 10.0f, 12.2502f)
                curveTo(8.4812f, 12.2502f, 7.25f, 13.4814f, 7.25f, 15.0002f)
                curveTo(7.25f, 16.519f, 8.4812f, 17.7502f, 10.0f, 17.7502f)
                curveTo(11.5188f, 17.7502f, 12.75f, 16.519f, 12.75f, 15.0002f)
                verticalLineTo(11.2137f)
                close()
            }
        }
            .build()
        return _uploadTrack!!
    }

private var _uploadTrack: ImageVector? = null
