package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(12.9726f)
                lineTo(14.4306f, 11.0119f)
                curveTo(14.7001f, 10.6974f, 15.1736f, 10.661f, 15.4881f, 10.9306f)
                curveTo(15.8026f, 11.2001f, 15.839f, 11.6736f, 15.5694f, 11.9881f)
                lineTo(12.5694f, 15.4881f)
                curveTo(12.427f, 15.6543f, 12.2189f, 15.75f, 12.0f, 15.75f)
                curveTo(11.7811f, 15.75f, 11.573f, 15.6543f, 11.4306f, 15.4881f)
                lineTo(8.4306f, 11.9881f)
                curveTo(8.161f, 11.6736f, 8.1974f, 11.2001f, 8.5119f, 10.9306f)
                curveTo(8.8264f, 10.661f, 9.2999f, 10.6974f, 9.5694f, 11.0119f)
                lineTo(11.25f, 12.9726f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(6.9958f, 8.252f)
                curveTo(7.41f, 8.2497f, 7.7477f, 8.5836f, 7.75f, 8.9978f)
                curveTo(7.7523f, 9.412f, 7.4184f, 9.7496f, 7.0042f, 9.7519f)
                curveTo(5.9107f, 9.758f, 5.1356f, 9.7864f, 4.5473f, 9.8945f)
                curveTo(3.9805f, 9.9986f, 3.6525f, 10.1658f, 3.409f, 10.4092f)
                curveTo(3.1323f, 10.686f, 2.9518f, 11.0746f, 2.8531f, 11.8083f)
                curveTo(2.7516f, 12.5637f, 2.75f, 13.5648f, 2.75f, 15.0002f)
                verticalLineTo(16.0002f)
                curveTo(2.75f, 17.4356f, 2.7516f, 18.4367f, 2.8531f, 19.1921f)
                curveTo(2.9518f, 19.9259f, 3.1323f, 20.3144f, 3.409f, 20.5912f)
                curveTo(3.6858f, 20.868f, 4.0743f, 21.0484f, 4.8081f, 21.1471f)
                curveTo(5.5635f, 21.2486f, 6.5646f, 21.2502f, 8.0f, 21.2502f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 21.2502f, 18.4365f, 21.2486f, 19.1919f, 21.1471f)
                curveTo(19.9257f, 21.0484f, 20.3142f, 20.868f, 20.591f, 20.5912f)
                curveTo(20.8678f, 20.3144f, 21.0482f, 19.9259f, 21.1469f, 19.1921f)
                curveTo(21.2484f, 18.4367f, 21.25f, 17.4356f, 21.25f, 16.0002f)
                verticalLineTo(15.0002f)
                curveTo(21.25f, 13.5648f, 21.2484f, 12.5637f, 21.1469f, 11.8083f)
                curveTo(21.0482f, 11.0746f, 20.8678f, 10.686f, 20.591f, 10.4092f)
                curveTo(20.3475f, 10.1658f, 20.0195f, 9.9986f, 19.4527f, 9.8945f)
                curveTo(18.8644f, 9.7864f, 18.0893f, 9.758f, 16.9958f, 9.7519f)
                curveTo(16.5816f, 9.7496f, 16.2477f, 9.412f, 16.25f, 8.9978f)
                curveTo(16.2523f, 8.5836f, 16.59f, 8.2497f, 17.0042f, 8.252f)
                curveTo(18.0857f, 8.258f, 18.9871f, 8.2839f, 19.7236f, 8.4192f)
                curveTo(20.4816f, 8.5584f, 21.1267f, 8.8236f, 21.6517f, 9.3486f)
                curveTo(22.2536f, 9.9505f, 22.5125f, 10.7084f, 22.6335f, 11.6085f)
                curveTo(22.75f, 12.4754f, 22.75f, 13.5778f, 22.75f, 14.9453f)
                verticalLineTo(16.0551f)
                curveTo(22.75f, 17.4227f, 22.75f, 18.525f, 22.6335f, 19.392f)
                curveTo(22.5125f, 20.2921f, 22.2536f, 21.0499f, 21.6517f, 21.6519f)
                curveTo(21.0497f, 22.2538f, 20.2919f, 22.5127f, 19.3918f, 22.6337f)
                curveTo(18.5248f, 22.7503f, 17.4225f, 22.7502f, 16.0549f, 22.7502f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 22.7502f, 5.4752f, 22.7503f, 4.6083f, 22.6337f)
                curveTo(3.7081f, 22.5127f, 2.9503f, 22.2538f, 2.3484f, 21.6519f)
                curveTo(1.7464f, 21.0499f, 1.4875f, 20.2921f, 1.3665f, 19.392f)
                curveTo(1.25f, 18.525f, 1.25f, 17.4227f, 1.25f, 16.0551f)
                verticalLineTo(14.9453f)
                curveTo(1.25f, 13.5778f, 1.25f, 12.4754f, 1.3665f, 11.6085f)
                curveTo(1.4875f, 10.7084f, 1.7464f, 9.9505f, 2.3484f, 9.3486f)
                curveTo(2.8733f, 8.8236f, 3.5183f, 8.5584f, 4.2764f, 8.4192f)
                curveTo(5.0129f, 8.2839f, 5.9143f, 8.258f, 6.9958f, 8.252f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
