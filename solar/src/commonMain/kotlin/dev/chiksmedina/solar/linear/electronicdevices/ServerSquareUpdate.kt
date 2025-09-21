package dev.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.ServerSquareUpdate: ImageVector
    get() {
        if (_serverSquareUpdate != null) {
            return _serverSquareUpdate!!
        }
        _serverSquareUpdate = Builder(
            name = "ServerSquareUpdate", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 21.75f)
                curveTo(13.4142f, 21.75f, 13.75f, 21.4142f, 13.75f, 21.0f)
                curveTo(13.75f, 20.5858f, 13.4142f, 20.25f, 13.0f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(3.1716f, 19.8284f)
                lineTo(3.7019f, 19.2981f)
                lineTo(3.7019f, 19.2981f)
                lineTo(3.1716f, 19.8284f)
                close()
                moveTo(20.8284f, 4.1716f)
                lineTo(20.2981f, 4.7019f)
                lineTo(20.2981f, 4.7019f)
                lineTo(20.8284f, 4.1716f)
                close()
                moveTo(21.25f, 13.0f)
                curveTo(21.25f, 13.4142f, 21.5858f, 13.75f, 22.0f, 13.75f)
                curveTo(22.4142f, 13.75f, 22.75f, 13.4142f, 22.75f, 13.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(10.0f, 3.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.75f)
                close()
                moveTo(2.75f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(13.0f, 20.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.25f)
                close()
                moveTo(21.25f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(1.25f, 13.0f)
                curveTo(1.25f, 14.8644f, 1.2484f, 16.3382f, 1.4031f, 17.489f)
                curveTo(1.5608f, 18.6614f, 1.8929f, 19.6104f, 2.6412f, 20.3588f)
                lineTo(3.7019f, 19.2981f)
                curveTo(3.2787f, 18.8749f, 3.025f, 18.2952f, 2.8898f, 17.2892f)
                curveTo(2.7516f, 16.2615f, 2.75f, 14.9068f, 2.75f, 13.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(10.0f, 20.25f)
                curveTo(8.0932f, 20.25f, 6.7385f, 20.2484f, 5.7108f, 20.1102f)
                curveTo(4.7048f, 19.975f, 4.1251f, 19.7213f, 3.7019f, 19.2981f)
                lineTo(2.6412f, 20.3588f)
                curveTo(3.3896f, 21.1071f, 4.3386f, 21.4392f, 5.511f, 21.5969f)
                curveTo(6.6618f, 21.7516f, 8.1356f, 21.75f, 10.0f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(14.0f, 3.75f)
                curveTo(15.9068f, 3.75f, 17.2615f, 3.7516f, 18.2892f, 3.8898f)
                curveTo(19.2952f, 4.025f, 19.8749f, 4.2787f, 20.2981f, 4.7019f)
                lineTo(21.3588f, 3.6412f)
                curveTo(20.6104f, 2.8929f, 19.6614f, 2.5608f, 18.489f, 2.4031f)
                curveTo(17.3382f, 2.2484f, 15.8644f, 2.25f, 14.0f, 2.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(22.75f, 11.0f)
                curveTo(22.75f, 9.1356f, 22.7516f, 7.6618f, 22.5969f, 6.511f)
                curveTo(22.4392f, 5.3386f, 22.1071f, 4.3896f, 21.3588f, 3.6412f)
                lineTo(20.2981f, 4.7019f)
                curveTo(20.7213f, 5.1251f, 20.975f, 5.7048f, 21.1102f, 6.7108f)
                curveTo(21.2484f, 7.7385f, 21.25f, 9.0932f, 21.25f, 11.0f)
                horizontalLineTo(22.75f)
                close()
                moveTo(10.0f, 2.25f)
                curveTo(8.1356f, 2.25f, 6.6618f, 2.2484f, 5.511f, 2.4031f)
                curveTo(4.3386f, 2.5608f, 3.3896f, 2.8929f, 2.6412f, 3.6412f)
                lineTo(3.7019f, 4.7019f)
                curveTo(4.1251f, 4.2787f, 4.7048f, 4.025f, 5.7108f, 3.8898f)
                curveTo(6.7385f, 3.7516f, 8.0932f, 3.75f, 10.0f, 3.75f)
                verticalLineTo(2.25f)
                close()
                moveTo(2.75f, 11.0f)
                curveTo(2.75f, 9.0932f, 2.7516f, 7.7385f, 2.8898f, 6.7108f)
                curveTo(3.025f, 5.7048f, 3.2787f, 5.1251f, 3.7019f, 4.7019f)
                lineTo(2.6412f, 3.6412f)
                curveTo(1.8929f, 4.3896f, 1.5608f, 5.3386f, 1.4031f, 6.511f)
                curveTo(1.2484f, 7.6618f, 1.25f, 9.1356f, 1.25f, 11.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 12.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(21.25f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 7.5f)
                lineTo(18.0f, 7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 17.5f)
                lineTo(6.0f, 15.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 8.5f)
                lineTo(6.0f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.5f)
                lineTo(9.0f, 15.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 8.5f)
                lineTo(9.0f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5841f, 17.5f)
                lineTo(14.8341f, 17.5f)
                lineTo(14.8341f, 17.5f)
                lineTo(15.5841f, 17.5f)
                close()
                moveTo(15.5841f, 18.0f)
                lineTo(15.0964f, 18.5698f)
                curveTo(15.3772f, 18.8101f, 15.7911f, 18.8101f, 16.0718f, 18.5698f)
                lineTo(15.5841f, 18.0f)
                close()
                moveTo(16.656f, 18.0698f)
                curveTo(16.9706f, 17.8004f, 17.0074f, 17.327f, 16.738f, 17.0123f)
                curveTo(16.4687f, 16.6976f, 15.9952f, 16.6609f, 15.6806f, 16.9302f)
                lineTo(16.656f, 18.0698f)
                close()
                moveTo(15.4877f, 16.9302f)
                curveTo(15.173f, 16.6609f, 14.6996f, 16.6976f, 14.4302f, 17.0123f)
                curveTo(14.1609f, 17.327f, 14.1976f, 17.8004f, 14.5123f, 18.0698f)
                lineTo(15.4877f, 16.9302f)
                close()
                moveTo(20.3892f, 16.6352f)
                curveTo(20.6296f, 16.9726f, 21.0979f, 17.0512f, 21.4352f, 16.8108f)
                curveTo(21.7726f, 16.5704f, 21.8512f, 16.1021f, 21.6108f, 15.7648f)
                lineTo(20.3892f, 16.6352f)
                close()
                moveTo(18.5048f, 14.25f)
                curveTo(16.5912f, 14.25f, 14.8341f, 15.5999f, 14.8341f, 17.5f)
                lineTo(16.3341f, 17.5f)
                curveTo(16.3341f, 16.6387f, 17.1923f, 15.75f, 18.5048f, 15.75f)
                lineTo(18.5048f, 14.25f)
                close()
                moveTo(14.8341f, 17.5f)
                lineTo(14.8341f, 18.0f)
                lineTo(16.3341f, 18.0f)
                lineTo(16.3341f, 17.5f)
                lineTo(14.8341f, 17.5f)
                close()
                moveTo(16.0718f, 18.5698f)
                lineTo(16.656f, 18.0698f)
                lineTo(15.6806f, 16.9302f)
                lineTo(15.0964f, 17.4302f)
                lineTo(16.0718f, 18.5698f)
                close()
                moveTo(16.0718f, 17.4302f)
                lineTo(15.4877f, 16.9302f)
                lineTo(14.5123f, 18.0698f)
                lineTo(15.0964f, 18.5698f)
                lineTo(16.0718f, 17.4302f)
                close()
                moveTo(21.6108f, 15.7648f)
                curveTo(20.945f, 14.8304f, 19.782f, 14.25f, 18.5048f, 14.25f)
                lineTo(18.5048f, 15.75f)
                curveTo(19.3411f, 15.75f, 20.0295f, 16.1304f, 20.3892f, 16.6352f)
                lineTo(21.6108f, 15.7648f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4952f, 21.0f)
                lineTo(18.4952f, 21.75f)
                lineTo(18.4952f, 21.0f)
                close()
                moveTo(21.4159f, 18.5f)
                horizontalLineTo(22.1659f)
                horizontalLineTo(21.4159f)
                close()
                moveTo(21.4159f, 18.0f)
                lineTo(21.9036f, 17.4302f)
                curveTo(21.6228f, 17.1899f, 21.2089f, 17.1899f, 20.9282f, 17.4302f)
                lineTo(21.4159f, 18.0f)
                close()
                moveTo(20.344f, 17.9302f)
                curveTo(20.0294f, 18.1996f, 19.9926f, 18.673f, 20.262f, 18.9877f)
                curveTo(20.5313f, 19.3024f, 21.0048f, 19.3391f, 21.3194f, 19.0698f)
                lineTo(20.344f, 17.9302f)
                close()
                moveTo(21.5123f, 19.0698f)
                curveTo(21.827f, 19.3391f, 22.3004f, 19.3024f, 22.5698f, 18.9877f)
                curveTo(22.8391f, 18.673f, 22.8024f, 18.1996f, 22.4877f, 17.9302f)
                lineTo(21.5123f, 19.0698f)
                close()
                moveTo(16.6108f, 19.3648f)
                curveTo(16.3704f, 19.0274f, 15.9021f, 18.9488f, 15.5648f, 19.1892f)
                curveTo(15.2274f, 19.4296f, 15.1488f, 19.8979f, 15.3892f, 20.2352f)
                lineTo(16.6108f, 19.3648f)
                close()
                moveTo(18.4952f, 21.75f)
                curveTo(20.4088f, 21.75f, 22.1659f, 20.4001f, 22.1659f, 18.5f)
                lineTo(20.6659f, 18.5f)
                curveTo(20.6659f, 19.3613f, 19.8077f, 20.25f, 18.4952f, 20.25f)
                lineTo(18.4952f, 21.75f)
                close()
                moveTo(22.1659f, 18.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.6659f)
                verticalLineTo(18.5f)
                horizontalLineTo(22.1659f)
                close()
                moveTo(20.9282f, 17.4302f)
                lineTo(20.344f, 17.9302f)
                lineTo(21.3194f, 19.0698f)
                lineTo(21.9036f, 18.5698f)
                lineTo(20.9282f, 17.4302f)
                close()
                moveTo(20.9282f, 18.5698f)
                lineTo(21.5123f, 19.0698f)
                lineTo(22.4877f, 17.9302f)
                lineTo(21.9036f, 17.4302f)
                lineTo(20.9282f, 18.5698f)
                close()
                moveTo(15.3892f, 20.2352f)
                curveTo(16.055f, 21.1696f, 17.218f, 21.75f, 18.4952f, 21.75f)
                lineTo(18.4952f, 20.25f)
                curveTo(17.6589f, 20.25f, 16.9705f, 19.8696f, 16.6108f, 19.3648f)
                lineTo(15.3892f, 20.2352f)
                close()
            }
        }
            .build()
        return _serverSquareUpdate!!
    }

private var _serverSquareUpdate: ImageVector? = null
