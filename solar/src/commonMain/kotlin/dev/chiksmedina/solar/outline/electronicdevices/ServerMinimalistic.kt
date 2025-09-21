package dev.chiksmedina.solar.outline.electronicdevices

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
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.ServerMinimalistic: ImageVector
    get() {
        if (_serverMinimalistic != null) {
            return _serverMinimalistic!!
        }
        _serverMinimalistic = Builder(
            name = "ServerMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.9748f, 2.25f)
                horizontalLineTo(19.0253f)
                curveTo(19.4697f, 2.25f, 19.8408f, 2.25f, 20.1454f, 2.2708f)
                curveTo(20.4625f, 2.2924f, 20.762f, 2.3391f, 21.0524f, 2.4593f)
                curveTo(21.7262f, 2.7384f, 22.2616f, 3.2738f, 22.5407f, 3.9476f)
                curveTo(22.661f, 4.238f, 22.7076f, 4.5375f, 22.7292f, 4.8546f)
                curveTo(22.75f, 5.1592f, 22.75f, 5.5303f, 22.75f, 5.9747f)
                verticalLineTo(6.0253f)
                curveTo(22.75f, 6.4697f, 22.75f, 6.8408f, 22.7292f, 7.1454f)
                curveTo(22.7076f, 7.4625f, 22.661f, 7.762f, 22.5407f, 8.0524f)
                curveTo(22.3908f, 8.4143f, 22.1669f, 8.7362f, 21.8875f, 9.0f)
                curveTo(22.1669f, 9.2638f, 22.3908f, 9.5857f, 22.5407f, 9.9476f)
                curveTo(22.661f, 10.238f, 22.7076f, 10.5375f, 22.7292f, 10.8546f)
                curveTo(22.75f, 11.1592f, 22.75f, 11.5303f, 22.75f, 11.9747f)
                verticalLineTo(12.0253f)
                curveTo(22.75f, 12.4697f, 22.75f, 12.8408f, 22.7292f, 13.1454f)
                curveTo(22.7076f, 13.4625f, 22.661f, 13.762f, 22.5407f, 14.0524f)
                curveTo(22.3908f, 14.4143f, 22.1669f, 14.7362f, 21.8875f, 15.0f)
                curveTo(22.1669f, 15.2638f, 22.3908f, 15.5857f, 22.5407f, 15.9476f)
                curveTo(22.661f, 16.238f, 22.7076f, 16.5375f, 22.7292f, 16.8546f)
                curveTo(22.75f, 17.1592f, 22.75f, 17.5303f, 22.75f, 17.9747f)
                verticalLineTo(18.0253f)
                curveTo(22.75f, 18.4697f, 22.75f, 18.8408f, 22.7292f, 19.1454f)
                curveTo(22.7076f, 19.4625f, 22.661f, 19.762f, 22.5407f, 20.0524f)
                curveTo(22.2616f, 20.7262f, 21.7262f, 21.2616f, 21.0524f, 21.5407f)
                curveTo(20.762f, 21.661f, 20.4625f, 21.7076f, 20.1454f, 21.7292f)
                curveTo(19.8408f, 21.75f, 19.4697f, 21.75f, 19.0253f, 21.75f)
                horizontalLineTo(4.9747f)
                curveTo(4.5303f, 21.75f, 4.1592f, 21.75f, 3.8546f, 21.7292f)
                curveTo(3.5375f, 21.7076f, 3.238f, 21.661f, 2.9476f, 21.5407f)
                curveTo(2.2738f, 21.2616f, 1.7384f, 20.7262f, 1.4593f, 20.0524f)
                curveTo(1.3391f, 19.762f, 1.2924f, 19.4625f, 1.2708f, 19.1454f)
                curveTo(1.25f, 18.8408f, 1.25f, 18.4697f, 1.25f, 18.0253f)
                verticalLineTo(17.9748f)
                curveTo(1.25f, 17.5303f, 1.25f, 17.1592f, 1.2708f, 16.8546f)
                curveTo(1.2924f, 16.5375f, 1.3391f, 16.238f, 1.4593f, 15.9476f)
                curveTo(1.6092f, 15.5857f, 1.8331f, 15.2638f, 2.1125f, 15.0f)
                curveTo(1.8331f, 14.7362f, 1.6092f, 14.4143f, 1.4593f, 14.0524f)
                curveTo(1.3391f, 13.762f, 1.2924f, 13.4625f, 1.2708f, 13.1454f)
                curveTo(1.25f, 12.8408f, 1.25f, 12.4697f, 1.25f, 12.0253f)
                verticalLineTo(11.9748f)
                curveTo(1.25f, 11.5303f, 1.25f, 11.1592f, 1.2708f, 10.8546f)
                curveTo(1.2924f, 10.5375f, 1.3391f, 10.238f, 1.4593f, 9.9476f)
                curveTo(1.6092f, 9.5857f, 1.8331f, 9.2638f, 2.1125f, 9.0f)
                curveTo(1.8331f, 8.7362f, 1.6092f, 8.4143f, 1.4593f, 8.0524f)
                curveTo(1.3391f, 7.762f, 1.2924f, 7.4625f, 1.2708f, 7.1454f)
                curveTo(1.25f, 6.8408f, 1.25f, 6.4697f, 1.25f, 6.0252f)
                verticalLineTo(5.9748f)
                curveTo(1.25f, 5.5303f, 1.25f, 5.1592f, 1.2708f, 4.8546f)
                curveTo(1.2924f, 4.5375f, 1.3391f, 4.238f, 1.4593f, 3.9476f)
                curveTo(1.7384f, 3.2738f, 2.2738f, 2.7384f, 2.9476f, 2.4593f)
                curveTo(3.238f, 2.3391f, 3.5375f, 2.2924f, 3.8546f, 2.2708f)
                curveTo(4.1592f, 2.25f, 4.5303f, 2.25f, 4.9748f, 2.25f)
                close()
                moveTo(5.0f, 8.25f)
                curveTo(4.5238f, 8.25f, 4.2042f, 8.2496f, 3.9567f, 8.2327f)
                curveTo(3.716f, 8.2163f, 3.5988f, 8.1868f, 3.5217f, 8.1549f)
                curveTo(3.2154f, 8.028f, 2.972f, 7.7846f, 2.8451f, 7.4784f)
                curveTo(2.8132f, 7.4012f, 2.7837f, 7.284f, 2.7673f, 7.0433f)
                curveTo(2.7504f, 6.7958f, 2.75f, 6.4762f, 2.75f, 6.0f)
                curveTo(2.75f, 5.5238f, 2.7504f, 5.2042f, 2.7673f, 4.9567f)
                curveTo(2.7837f, 4.716f, 2.8132f, 4.5988f, 2.8451f, 4.5216f)
                curveTo(2.972f, 4.2154f, 3.2154f, 3.972f, 3.5217f, 3.8451f)
                curveTo(3.5988f, 3.8132f, 3.716f, 3.7837f, 3.9567f, 3.7673f)
                curveTo(4.2042f, 3.7504f, 4.5238f, 3.75f, 5.0f, 3.75f)
                horizontalLineTo(19.0f)
                curveTo(19.4762f, 3.75f, 19.7958f, 3.7504f, 20.0433f, 3.7673f)
                curveTo(20.284f, 3.7837f, 20.4012f, 3.8132f, 20.4784f, 3.8451f)
                curveTo(20.7846f, 3.972f, 21.028f, 4.2154f, 21.1549f, 4.5216f)
                curveTo(21.1868f, 4.5988f, 21.2163f, 4.716f, 21.2327f, 4.9567f)
                curveTo(21.2496f, 5.2042f, 21.25f, 5.5238f, 21.25f, 6.0f)
                curveTo(21.25f, 6.4762f, 21.2496f, 6.7958f, 21.2327f, 7.0433f)
                curveTo(21.2163f, 7.284f, 21.1868f, 7.4012f, 21.1549f, 7.4784f)
                curveTo(21.028f, 7.7846f, 20.7846f, 8.028f, 20.4784f, 8.1549f)
                curveTo(20.4012f, 8.1868f, 20.284f, 8.2163f, 20.0433f, 8.2327f)
                curveTo(19.7958f, 8.2496f, 19.4762f, 8.25f, 19.0f, 8.25f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 9.75f)
                curveTo(4.5238f, 9.75f, 4.2042f, 9.7504f, 3.9567f, 9.7673f)
                curveTo(3.716f, 9.7837f, 3.5988f, 9.8132f, 3.5217f, 9.8451f)
                curveTo(3.2154f, 9.972f, 2.972f, 10.2154f, 2.8451f, 10.5216f)
                curveTo(2.8132f, 10.5988f, 2.7837f, 10.716f, 2.7673f, 10.9567f)
                curveTo(2.7504f, 11.2042f, 2.75f, 11.5238f, 2.75f, 12.0f)
                curveTo(2.75f, 12.4762f, 2.7504f, 12.7958f, 2.7673f, 13.0433f)
                curveTo(2.7837f, 13.284f, 2.8132f, 13.4012f, 2.8451f, 13.4784f)
                curveTo(2.972f, 13.7846f, 3.2154f, 14.028f, 3.5217f, 14.1549f)
                curveTo(3.5988f, 14.1868f, 3.716f, 14.2163f, 3.9567f, 14.2327f)
                curveTo(4.2042f, 14.2496f, 4.5238f, 14.25f, 5.0f, 14.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4762f, 14.25f, 19.7958f, 14.2496f, 20.0433f, 14.2327f)
                curveTo(20.284f, 14.2163f, 20.4012f, 14.1868f, 20.4784f, 14.1549f)
                curveTo(20.7846f, 14.028f, 21.028f, 13.7846f, 21.1549f, 13.4784f)
                curveTo(21.1868f, 13.4012f, 21.2163f, 13.284f, 21.2327f, 13.0433f)
                curveTo(21.2496f, 12.7958f, 21.25f, 12.4762f, 21.25f, 12.0f)
                curveTo(21.25f, 11.5238f, 21.2496f, 11.2042f, 21.2327f, 10.9567f)
                curveTo(21.2163f, 10.716f, 21.1868f, 10.5988f, 21.1549f, 10.5216f)
                curveTo(21.028f, 10.2154f, 20.7846f, 9.972f, 20.4784f, 9.8451f)
                curveTo(20.4012f, 9.8132f, 20.284f, 9.7837f, 20.0433f, 9.7673f)
                curveTo(19.7958f, 9.7504f, 19.4762f, 9.75f, 19.0f, 9.75f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 15.75f)
                curveTo(4.5238f, 15.75f, 4.2042f, 15.7504f, 3.9567f, 15.7673f)
                curveTo(3.716f, 15.7837f, 3.5988f, 15.8132f, 3.5217f, 15.8452f)
                curveTo(3.2154f, 15.972f, 2.972f, 16.2154f, 2.8451f, 16.5216f)
                curveTo(2.8132f, 16.5988f, 2.7837f, 16.716f, 2.7673f, 16.9567f)
                curveTo(2.7504f, 17.2042f, 2.75f, 17.5238f, 2.75f, 18.0f)
                curveTo(2.75f, 18.4762f, 2.7504f, 18.7958f, 2.7673f, 19.0433f)
                curveTo(2.7837f, 19.284f, 2.8132f, 19.4012f, 2.8451f, 19.4784f)
                curveTo(2.972f, 19.7846f, 3.2154f, 20.028f, 3.5217f, 20.1549f)
                curveTo(3.5988f, 20.1868f, 3.716f, 20.2163f, 3.9567f, 20.2327f)
                curveTo(4.2042f, 20.2496f, 4.5238f, 20.25f, 5.0f, 20.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4762f, 20.25f, 19.7958f, 20.2496f, 20.0433f, 20.2327f)
                curveTo(20.284f, 20.2163f, 20.4012f, 20.1868f, 20.4784f, 20.1549f)
                curveTo(20.7846f, 20.028f, 21.028f, 19.7846f, 21.1549f, 19.4784f)
                curveTo(21.1868f, 19.4012f, 21.2163f, 19.284f, 21.2327f, 19.0433f)
                curveTo(21.2496f, 18.7958f, 21.25f, 18.4762f, 21.25f, 18.0f)
                curveTo(21.25f, 17.5238f, 21.2496f, 17.2042f, 21.2327f, 16.9567f)
                curveTo(21.2163f, 16.716f, 21.1868f, 16.5988f, 21.1549f, 16.5216f)
                curveTo(21.028f, 16.2154f, 20.7846f, 15.972f, 20.4784f, 15.8452f)
                curveTo(20.4012f, 15.8132f, 20.284f, 15.7837f, 20.0433f, 15.7673f)
                curveTo(19.7958f, 15.7504f, 19.4762f, 15.75f, 19.0f, 15.75f)
                horizontalLineTo(5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 12.5523f, 5.5523f, 13.0f, 5.0f, 13.0f)
                curveTo(4.4477f, 13.0f, 4.0f, 12.5523f, 4.0f, 12.0f)
                curveTo(4.0f, 11.4477f, 4.4477f, 11.0f, 5.0f, 11.0f)
                curveTo(5.5523f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 6.5523f, 5.5523f, 7.0f, 5.0f, 7.0f)
                curveTo(4.4477f, 7.0f, 4.0f, 6.5523f, 4.0f, 6.0f)
                curveTo(4.0f, 5.4477f, 4.4477f, 5.0f, 5.0f, 5.0f)
                curveTo(5.5523f, 5.0f, 6.0f, 5.4477f, 6.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 18.0f)
                curveTo(6.0f, 18.5523f, 5.5523f, 19.0f, 5.0f, 19.0f)
                curveTo(4.4477f, 19.0f, 4.0f, 18.5523f, 4.0f, 18.0f)
                curveTo(4.0f, 17.4477f, 4.4477f, 17.0f, 5.0f, 17.0f)
                curveTo(5.5523f, 17.0f, 6.0f, 17.4477f, 6.0f, 18.0f)
                close()
            }
        }
            .build()
        return _serverMinimalistic!!
    }

private var _serverMinimalistic: ImageVector? = null
