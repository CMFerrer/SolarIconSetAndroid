package dev.chiksmedina.solar.outline.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoldersGroup

val FoldersGroup.FolderPathConnect: ImageVector
    get() {
        if (_folderPathConnect != null) {
            return _folderPathConnect!!
        }
        _folderPathConnect = Builder(
            name = "FolderPathConnect", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.3879f, 1.25f)
                curveTo(8.4131f, 1.25f, 8.4388f, 1.25f, 8.4648f, 1.25f)
                lineTo(8.4963f, 1.25f)
                curveTo(8.7368f, 1.25f, 8.9028f, 1.25f, 9.0658f, 1.2641f)
                curveTo(9.765f, 1.3248f, 10.4341f, 1.5802f, 10.9846f, 2.004f)
                curveTo(11.1131f, 2.103f, 11.2328f, 2.2141f, 11.4016f, 2.3709f)
                lineTo(11.8103f, 2.7504f)
                curveTo(12.4107f, 3.3079f, 12.6127f, 3.4869f, 12.8427f, 3.6057f)
                curveTo(12.9815f, 3.6774f, 13.1296f, 3.7345f, 13.2842f, 3.7754f)
                curveTo(13.5441f, 3.8442f, 13.8327f, 3.85f, 14.6799f, 3.85f)
                lineTo(14.9872f, 3.85f)
                curveTo(15.8696f, 3.85f, 16.5971f, 3.85f, 17.1763f, 3.9176f)
                curveTo(17.7797f, 3.988f, 18.3261f, 4.1412f, 18.7851f, 4.5245f)
                curveTo(18.8603f, 4.5873f, 18.932f, 4.654f, 19.0001f, 4.7242f)
                curveTo(19.4228f, 5.1607f, 19.5969f, 5.6905f, 19.6759f, 6.2736f)
                curveTo(19.7501f, 6.8214f, 19.75f, 7.5057f, 19.75f, 8.3177f)
                verticalLineTo(9.8574f)
                curveTo(19.75f, 11.0342f, 19.7501f, 11.9985f, 19.6397f, 12.7604f)
                curveTo(19.5237f, 13.5622f, 19.2723f, 14.2476f, 18.6902f, 14.7881f)
                curveTo(18.1161f, 15.3213f, 17.4013f, 15.5447f, 16.5653f, 15.6491f)
                curveTo(15.7563f, 15.7501f, 14.7276f, 15.75f, 13.4511f, 15.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(17.3535f)
                curveTo(13.6658f, 17.6126f, 14.3875f, 18.3342f, 14.6465f, 19.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 19.25f, 22.75f, 19.5858f, 22.75f, 20.0f)
                curveTo(22.75f, 20.4142f, 22.4142f, 20.75f, 22.0f, 20.75f)
                horizontalLineTo(14.6465f)
                curveTo(14.32f, 21.9043f, 13.2588f, 22.75f, 12.0f, 22.75f)
                curveTo(10.7412f, 22.75f, 9.68f, 21.9043f, 9.3535f, 20.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 20.75f, 1.25f, 20.4142f, 1.25f, 20.0f)
                curveTo(1.25f, 19.5858f, 1.5858f, 19.25f, 2.0f, 19.25f)
                horizontalLineTo(9.3535f)
                curveTo(9.6125f, 18.3342f, 10.3342f, 17.6126f, 11.25f, 17.3535f)
                verticalLineTo(15.75f)
                horizontalLineTo(10.5489f)
                curveTo(9.2724f, 15.75f, 8.2437f, 15.7501f, 7.4347f, 15.6491f)
                curveTo(6.5987f, 15.5447f, 5.8839f, 15.3213f, 5.3098f, 14.7881f)
                curveTo(4.7277f, 14.2476f, 4.4763f, 13.5622f, 4.3602f, 12.7604f)
                curveTo(4.2499f, 11.9986f, 4.25f, 11.0342f, 4.25f, 9.8574f)
                lineTo(4.25f, 5.2174f)
                curveTo(4.25f, 5.1898f, 4.25f, 5.1628f, 4.25f, 5.1361f)
                curveTo(4.2498f, 4.6415f, 4.2497f, 4.2831f, 4.3136f, 3.9686f)
                curveTo(4.5943f, 2.5872f, 5.7434f, 1.553f, 7.1514f, 1.3063f)
                curveTo(7.4742f, 1.2498f, 7.8443f, 1.2499f, 8.3879f, 1.25f)
                close()
                moveTo(13.4f, 14.25f)
                curveTo(14.7397f, 14.25f, 15.6743f, 14.2486f, 16.3794f, 14.1606f)
                curveTo(17.0684f, 14.0746f, 17.4236f, 13.9173f, 17.6696f, 13.6889f)
                curveTo(17.9076f, 13.4679f, 18.0663f, 13.1597f, 18.1552f, 12.5455f)
                curveTo(18.2482f, 11.9036f, 18.25f, 11.0485f, 18.25f, 9.8f)
                verticalLineTo(8.3687f)
                curveTo(18.25f, 7.492f, 18.2484f, 6.9102f, 18.1895f, 6.4749f)
                curveTo(18.1337f, 6.0634f, 18.0385f, 5.8874f, 17.9227f, 5.7678f)
                curveTo(17.8916f, 5.7358f, 17.8585f, 5.705f, 17.8236f, 5.6758f)
                curveTo(17.6836f, 5.559f, 17.47f, 5.4621f, 17.0023f, 5.4075f)
                curveTo(16.5205f, 5.3512f, 15.8811f, 5.35f, 14.9415f, 5.35f)
                horizontalLineTo(14.6799f)
                curveTo(14.648f, 5.35f, 14.6165f, 5.35f, 14.5854f, 5.35f)
                curveTo(13.8689f, 5.3503f, 13.3725f, 5.3504f, 12.9003f, 5.2255f)
                curveTo(12.6415f, 5.1569f, 12.3911f, 5.0608f, 12.1542f, 4.9384f)
                curveTo(11.7198f, 4.7139f, 11.363f, 4.3824f, 10.8581f, 3.9132f)
                curveTo(10.8356f, 3.8923f, 10.8128f, 3.8711f, 10.7897f, 3.8496f)
                lineTo(10.4045f, 3.492f)
                curveTo(10.2031f, 3.3049f, 10.1364f, 3.2441f, 10.0697f, 3.1927f)
                curveTo(9.753f, 2.9489f, 9.3583f, 2.7952f, 8.936f, 2.7585f)
                curveTo(8.8459f, 2.7507f, 8.7485f, 2.75f, 8.4648f, 2.75f)
                curveTo(7.8153f, 2.75f, 7.5872f, 2.7529f, 7.4103f, 2.7838f)
                curveTo(6.553f, 2.9341f, 5.9302f, 3.5453f, 5.7835f, 4.2673f)
                curveTo(5.7538f, 4.4137f, 5.75f, 4.6071f, 5.75f, 5.2174f)
                verticalLineTo(9.8f)
                curveTo(5.75f, 11.0485f, 5.7518f, 11.9036f, 5.8448f, 12.5455f)
                curveTo(5.9337f, 13.1597f, 6.0924f, 13.4679f, 6.3304f, 13.6889f)
                curveTo(6.5764f, 13.9173f, 6.9316f, 14.0746f, 7.6206f, 14.1606f)
                curveTo(8.3257f, 14.2486f, 9.2603f, 14.25f, 10.6f, 14.25f)
                horizontalLineTo(13.4f)
                close()
                moveTo(12.75f, 7.5f)
                curveTo(12.75f, 7.0858f, 13.0858f, 6.75f, 13.5f, 6.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 6.75f, 17.25f, 7.0858f, 17.25f, 7.5f)
                curveTo(17.25f, 7.9142f, 16.9142f, 8.25f, 16.5f, 8.25f)
                horizontalLineTo(13.5f)
                curveTo(13.0858f, 8.25f, 12.75f, 7.9142f, 12.75f, 7.5f)
                close()
                moveTo(12.0f, 18.75f)
                curveTo(11.3096f, 18.75f, 10.75f, 19.3097f, 10.75f, 20.0f)
                curveTo(10.75f, 20.6904f, 11.3096f, 21.25f, 12.0f, 21.25f)
                curveTo(12.6904f, 21.25f, 13.25f, 20.6904f, 13.25f, 20.0f)
                curveTo(13.25f, 19.3097f, 12.6904f, 18.75f, 12.0f, 18.75f)
                close()
            }
        }
            .build()
        return _folderPathConnect!!
    }

private var _folderPathConnect: ImageVector? = null
