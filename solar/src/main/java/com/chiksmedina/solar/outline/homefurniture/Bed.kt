package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

public val HomeFurnitureGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9436f, 3.25f)
                horizontalLineTo(13.0564f)
                curveTo(14.8942f, 3.25f, 16.3498f, 3.25f, 17.489f, 3.4031f)
                curveTo(18.6614f, 3.5608f, 19.6104f, 3.8929f, 20.3588f, 4.6412f)
                curveTo(21.1071f, 5.3896f, 21.4392f, 6.3386f, 21.5969f, 7.511f)
                curveTo(21.7482f, 8.6368f, 21.75f, 10.0715f, 21.75f, 11.8787f)
                curveTo(22.0939f, 12.1624f, 22.3669f, 12.5282f, 22.5407f, 12.9476f)
                curveTo(22.661f, 13.238f, 22.7076f, 13.5375f, 22.7292f, 13.8546f)
                curveTo(22.75f, 14.1592f, 22.75f, 14.5303f, 22.75f, 14.9747f)
                verticalLineTo(15.0253f)
                curveTo(22.75f, 15.4697f, 22.75f, 15.8408f, 22.7292f, 16.1454f)
                curveTo(22.7076f, 16.4625f, 22.661f, 16.762f, 22.5407f, 17.0524f)
                curveTo(22.2616f, 17.7262f, 21.7262f, 18.2616f, 21.0524f, 18.5407f)
                curveTo(20.762f, 18.661f, 20.4625f, 18.7076f, 20.1454f, 18.7292f)
                curveTo(20.0242f, 18.7375f, 19.8926f, 18.7425f, 19.75f, 18.7455f)
                verticalLineTo(20.0f)
                curveTo(19.75f, 20.4142f, 19.4142f, 20.75f, 19.0f, 20.75f)
                curveTo(18.5858f, 20.75f, 18.25f, 20.4142f, 18.25f, 20.0f)
                verticalLineTo(18.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(20.0f)
                curveTo(5.75f, 20.4142f, 5.4142f, 20.75f, 5.0f, 20.75f)
                curveTo(4.5858f, 20.75f, 4.25f, 20.4142f, 4.25f, 20.0f)
                verticalLineTo(18.7455f)
                curveTo(4.1074f, 18.7425f, 3.9758f, 18.7375f, 3.8546f, 18.7292f)
                curveTo(3.5375f, 18.7076f, 3.238f, 18.661f, 2.9476f, 18.5407f)
                curveTo(2.2738f, 18.2616f, 1.7384f, 17.7262f, 1.4593f, 17.0524f)
                curveTo(1.3391f, 16.762f, 1.2924f, 16.4625f, 1.2708f, 16.1454f)
                curveTo(1.25f, 15.8408f, 1.25f, 15.4697f, 1.25f, 15.0253f)
                verticalLineTo(14.9748f)
                curveTo(1.25f, 14.5303f, 1.25f, 14.1592f, 1.2708f, 13.8546f)
                curveTo(1.2924f, 13.5375f, 1.3391f, 13.238f, 1.4593f, 12.9476f)
                curveTo(1.6331f, 12.5282f, 1.9061f, 12.1624f, 2.25f, 11.8787f)
                curveTo(2.25f, 10.0715f, 2.2518f, 8.6368f, 2.4031f, 7.511f)
                curveTo(2.5608f, 6.3386f, 2.8929f, 5.3896f, 3.6412f, 4.6412f)
                curveTo(4.3896f, 3.8929f, 5.3386f, 3.5608f, 6.511f, 3.4031f)
                curveTo(7.6502f, 3.25f, 9.1058f, 3.25f, 10.9436f, 3.25f)
                close()
                moveTo(3.7504f, 11.2789f)
                curveTo(3.7849f, 11.2758f, 3.8197f, 11.2732f, 3.8546f, 11.2708f)
                curveTo(4.1064f, 11.2536f, 4.4035f, 11.2506f, 4.75f, 11.2501f)
                lineTo(4.75f, 10.448f)
                curveTo(4.75f, 9.5495f, 4.7499f, 8.8003f, 4.8299f, 8.2055f)
                curveTo(4.9143f, 7.5777f, 5.1f, 7.0109f, 5.5555f, 6.5555f)
                curveTo(6.0109f, 6.1f, 6.5777f, 5.9143f, 7.2055f, 5.8299f)
                curveTo(7.8003f, 5.7499f, 8.5495f, 5.75f, 9.448f, 5.75f)
                horizontalLineTo(14.552f)
                curveTo(15.4505f, 5.75f, 16.1997f, 5.7499f, 16.7945f, 5.8299f)
                curveTo(17.4223f, 5.9143f, 17.9891f, 6.1f, 18.4445f, 6.5555f)
                curveTo(18.9f, 7.0109f, 19.0857f, 7.5777f, 19.1701f, 8.2055f)
                curveTo(19.2501f, 8.8003f, 19.25f, 9.5495f, 19.25f, 10.448f)
                verticalLineTo(11.2501f)
                curveTo(19.5965f, 11.2506f, 19.8936f, 11.2536f, 20.1454f, 11.2708f)
                curveTo(20.1803f, 11.2732f, 20.2151f, 11.2758f, 20.2496f, 11.2789f)
                curveTo(20.2472f, 9.7441f, 20.2303f, 8.604f, 20.1102f, 7.7108f)
                curveTo(19.975f, 6.7048f, 19.7213f, 6.1251f, 19.2981f, 5.7019f)
                curveTo(18.8749f, 5.2787f, 18.2952f, 5.025f, 17.2892f, 4.8898f)
                curveTo(16.2615f, 4.7516f, 14.9068f, 4.75f, 13.0f, 4.75f)
                horizontalLineTo(11.0f)
                curveTo(9.0932f, 4.75f, 7.7385f, 4.7516f, 6.7108f, 4.8898f)
                curveTo(5.7048f, 5.025f, 5.1251f, 5.2787f, 4.7019f, 5.7019f)
                curveTo(4.2787f, 6.1251f, 4.025f, 6.7048f, 3.8898f, 7.7108f)
                curveTo(3.7697f, 8.604f, 3.7528f, 9.7441f, 3.7504f, 11.2789f)
                close()
                moveTo(17.75f, 11.25f)
                verticalLineTo(10.5f)
                curveTo(17.75f, 9.536f, 17.7484f, 8.8884f, 17.6835f, 8.4054f)
                curveTo(17.6214f, 7.9439f, 17.5142f, 7.7464f, 17.3839f, 7.6161f)
                curveTo(17.2536f, 7.4858f, 17.0561f, 7.3786f, 16.5946f, 7.3165f)
                curveTo(16.1116f, 7.2516f, 15.464f, 7.25f, 14.5f, 7.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(17.75f)
                close()
                moveTo(11.25f, 11.25f)
                verticalLineTo(7.25f)
                horizontalLineTo(9.5f)
                curveTo(8.536f, 7.25f, 7.8884f, 7.2516f, 7.4054f, 7.3165f)
                curveTo(6.9439f, 7.3786f, 6.7464f, 7.4858f, 6.6161f, 7.6161f)
                curveTo(6.4858f, 7.7464f, 6.3786f, 7.9439f, 6.3165f, 8.4054f)
                curveTo(6.2516f, 8.8884f, 6.25f, 9.536f, 6.25f, 10.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                close()
                moveTo(3.9567f, 12.7673f)
                curveTo(3.716f, 12.7837f, 3.5988f, 12.8132f, 3.5217f, 12.8452f)
                curveTo(3.2154f, 12.972f, 2.972f, 13.2154f, 2.8451f, 13.5216f)
                curveTo(2.8132f, 13.5988f, 2.7837f, 13.716f, 2.7673f, 13.9567f)
                curveTo(2.7504f, 14.2042f, 2.75f, 14.5238f, 2.75f, 15.0f)
                curveTo(2.75f, 15.4762f, 2.7504f, 15.7958f, 2.7673f, 16.0433f)
                curveTo(2.7837f, 16.284f, 2.8132f, 16.4012f, 2.8451f, 16.4784f)
                curveTo(2.972f, 16.7846f, 3.2154f, 17.028f, 3.5217f, 17.1549f)
                curveTo(3.5988f, 17.1868f, 3.716f, 17.2163f, 3.9567f, 17.2327f)
                curveTo(4.2042f, 17.2496f, 4.5238f, 17.25f, 5.0f, 17.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4762f, 17.25f, 19.7958f, 17.2496f, 20.0433f, 17.2327f)
                curveTo(20.284f, 17.2163f, 20.4012f, 17.1868f, 20.4784f, 17.1549f)
                curveTo(20.7846f, 17.028f, 21.028f, 16.7846f, 21.1549f, 16.4784f)
                curveTo(21.1868f, 16.4012f, 21.2163f, 16.284f, 21.2327f, 16.0433f)
                curveTo(21.2496f, 15.7958f, 21.25f, 15.4762f, 21.25f, 15.0f)
                curveTo(21.25f, 14.5238f, 21.2496f, 14.2042f, 21.2327f, 13.9567f)
                curveTo(21.2163f, 13.716f, 21.1868f, 13.5988f, 21.1549f, 13.5216f)
                curveTo(21.028f, 13.2154f, 20.7846f, 12.972f, 20.4784f, 12.8452f)
                curveTo(20.4012f, 12.8132f, 20.284f, 12.7837f, 20.0433f, 12.7673f)
                curveTo(19.7958f, 12.7504f, 19.4762f, 12.75f, 19.0f, 12.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5238f, 12.75f, 4.2042f, 12.7504f, 3.9567f, 12.7673f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
